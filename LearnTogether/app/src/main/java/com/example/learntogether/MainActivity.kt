package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.learntogether.ui.theme.LearnTogetherTheme

enum class Exercise { ARTICLE, TASK_COMPLETED, QUADRANT }

// Change this value to select the exercise displayed when launching the app.
private val selectedExercise = Exercise.QUADRANT

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseTheme {
                Scaffold(containerColor = Color.White) { innerPadding ->
                    val modifier = Modifier.fillMaxSize().padding(innerPadding)
                    when (selectedExercise) {
                        Exercise.ARTICLE -> ComposeArticleScreen(modifier)
                        Exercise.TASK_COMPLETED -> TaskCompletedScreen(modifier)
                        Exercise.QUADRANT -> ComposeQuadrantScreen(modifier)
                    }
                }
            }
        }
    }
}

@Composable
fun ExerciseTheme(content: @Composable () -> Unit) {
    LearnTogetherTheme(darkTheme = false, dynamicColor = false) {
        Surface(color = Color.White, contentColor = Color.Black, content = content)
    }
}
