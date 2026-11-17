package com.example.tarjetasdepresentacin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetasdepresentacin.ui.theme.TarjetasDePresentaciónTheme

private object BusinessCardColors {
    val Background = Color(0xFFD2E8D4)
    val Green = Color(0xFF006D3B)
    val Text = Color(0xFF1B1B1B)
    val LogoBackground = Color(0xFF073042)
}

@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier) {
    BoxWithConstraints(
        modifier.fillMaxSize().background(BusinessCardColors.Background).safeDrawingPadding()
    ) {
        // Minimum viewport height keeps the contacts low; scrolling accommodates large text.
        Column(
            Modifier.fillMaxWidth().verticalScroll(rememberScrollState())
                .heightIn(min = maxHeight).padding(horizontal = 24.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.weight(1f))
            ProfileSection()
            Spacer(Modifier.height(32.dp))
            Spacer(Modifier.weight(1f))
            ContactSection()
        }
    }
}

@Composable
fun ProfileSection(modifier: Modifier = Modifier) {
    Column(modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painterResource(R.drawable.android_logo),
            contentDescription = stringResource(R.string.android_logo_description),
            modifier = Modifier.size(100.dp).background(BusinessCardColors.LogoBackground)
        )
        Spacer(Modifier.height(16.dp))
        Text(stringResource(R.string.person_name), fontSize = 36.sp,
            color = BusinessCardColors.Text, textAlign = TextAlign.Center)
        Spacer(Modifier.height(8.dp))
        Text(stringResource(R.string.profession), fontSize = 16.sp,
            fontWeight = FontWeight.Bold, color = BusinessCardColors.Green,
            textAlign = TextAlign.Center)
    }
}

@Composable
fun ContactSection(modifier: Modifier = Modifier) {
    Column(modifier.width(IntrinsicSize.Max), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        ContactItem(Icons.Default.Phone, stringResource(R.string.phone),
            stringResource(R.string.phone_description))
        ContactItem(Icons.Default.Person, stringResource(R.string.profile),
            stringResource(R.string.profile_description))
        ContactItem(Icons.Default.Email, stringResource(R.string.email),
            stringResource(R.string.email_description))
    }
}

@Composable
fun ContactItem(
    icon: ImageVector,
    text: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Row(modifier.semantics(mergeDescendants = true) {},
        verticalAlignment = Alignment.CenterVertically) {
        Icon(icon, contentDescription, Modifier.size(24.dp), tint = BusinessCardColors.Green)
        Spacer(Modifier.width(20.dp))
        Text(text, color = BusinessCardColors.Text, fontSize = 14.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true, widthDp = 360, heightDp = 800)
@Preview(showBackground = true, widthDp = 640, heightDp = 360)
@Preview(showBackground = true, widthDp = 320, heightDp = 640, fontScale = 2f)
@Composable
fun BusinessCardPreview() {
    TarjetasDePresentaciónTheme {
        BusinessCardScreen()
    }
}
