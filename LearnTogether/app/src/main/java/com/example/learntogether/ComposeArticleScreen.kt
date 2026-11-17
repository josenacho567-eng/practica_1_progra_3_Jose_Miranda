package com.example.learntogether

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ComposeArticleScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Text(stringResource(R.string.article_title), fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(stringResource(R.string.article_intro), textAlign = TextAlign.Justify, modifier = Modifier.padding(horizontal = 16.dp))
        Text(stringResource(R.string.article_body), textAlign = TextAlign.Justify, modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true, widthDp = 411, heightDp = 891)
@Composable
fun ComposeArticlePreview() {
    ExerciseTheme { ComposeArticleScreen() }
}
