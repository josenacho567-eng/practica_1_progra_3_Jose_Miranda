# Mis Proyectos Android (Jetpack Compose)

Este repositorio contiene los proyectos prácticos desarrollados con **Kotlin** y **Jetpack Compose**:

- **`HappyBirthday`**: Tarjeta de felicitación de cumpleaños con imagen de fondo y textos estilizados.
- **`LearnTogether`**: Colección de 3 ejercicios de diseño en Jetpack Compose (Artículo de Compose, Administrador de tareas y Cuadrante de Compose).
- **`tarjetasdepresentacin`**: Aplicación de tarjeta de presentación personal (Business Card).

---

## 🔄 Cómo cambiar entre pantallas en `LearnTogether`

El proyecto **`LearnTogether`** agrupa tres ejercicios distintos dentro de una misma aplicación. Puedes alternar qué pantalla se muestra al ejecutar la app (o ver cada una por separado en la vista previa de Android Studio).

### Opción 1: Cambiar la pantalla al ejecutar la app

1. Abre el archivo [`LearnTogether/app/src/main/java/com/example/learntogether/MainActivity.kt`](./LearnTogether/app/src/main/java/com/example/learntogether/MainActivity.kt).
2. Busca la constante `selectedExercise` en la **línea 19**:

```kotlin
enum class Exercise { ARTICLE, TASK_COMPLETED, QUADRANT }

// Change this value to select the exercise displayed when launching the app.
private val selectedExercise = Exercise.QUADRANT
```

3. Cambia el valor de `selectedExercise` por cualquiera de las 3 opciones disponibles en el `enum class Exercise`:

| Valor de `selectedExercise` | Pantalla que muestra | Archivo correspondiente |
| :--- | :--- | :--- |
| `Exercise.ARTICLE` | **Artículo de Compose** (`ComposeArticleScreen`) | `ComposeArticleScreen.kt` |
| `Exercise.TASK_COMPLETED` | **Administrador de tareas / Tareas completadas** (`TaskCompletedScreen`) | `TaskCompletedScreen.kt` |
| `Exercise.QUADRANT` | **Cuadrante de Compose** (`ComposeQuadrantScreen`) | `ComposeQuadrantScreen.kt` |

4. Vuelve a ejecutar la aplicación (**Run 'app'**) en tu emulador o dispositivo físico para ver la pantalla seleccionada.

### Opción 2: Ver cada pantalla sin ejecutar la app (`@Preview`)

Cada ejercicio cuenta con su propia función `@Preview` configurada. Si solo quieres visualizar el diseño en Android Studio sin compilar en el emulador:

1. Abre cualquiera de los archivos de pantalla en `LearnTogether/app/src/main/java/com/example/learntogether/`:
   - `ComposeArticleScreen.kt` (`ComposeArticlePreview`)
   - `TaskCompletedScreen.kt` (`TaskCompletedPreview`)
   - `ComposeQuadrantScreen.kt` (`ComposeQuadrantPreview`)
2. Cambia a la vista **Split** o **Design** arriba a la derecha del editor en Android Studio.
