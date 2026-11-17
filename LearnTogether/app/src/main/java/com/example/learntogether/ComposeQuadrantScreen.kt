package com.example.learntogether

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ComposeQuadrantScreen(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            QuadrantCard(stringResource(R.string.text_title), stringResource(R.string.text_description), Color(0xFFEADDFF), Modifier.weight(1f))
            QuadrantCard(stringResource(R.string.image_title), stringResource(R.string.image_description), Color(0xFFD0BCFF), Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            QuadrantCard(stringResource(R.string.row_title), stringResource(R.string.row_description), Color(0xFFB69DF8), Modifier.weight(1f))
            QuadrantCard(stringResource(R.string.column_title), stringResource(R.string.column_description), Color(0xFFF6EDFF), Modifier.weight(1f))
        }
    }
}

@Composable
fun QuadrantCard(title: String, description: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxHeight().background(backgroundColor).padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
        Text(description, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 891)
@Composable
fun ComposeQuadrantPreview() {
    ExerciseTheme { ComposeQuadrantScreen() }
}
