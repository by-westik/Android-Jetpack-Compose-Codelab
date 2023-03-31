package com.by.westik.compose.android.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.by.westik.compose.android.birthdayapp.ui.theme.BirthdayAppTheme

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun CreateTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        fontWeight = FontWeight.SemiBold
    )
}

@Composable
fun CreateText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text
    )
}

@Composable
fun CreateQuadrant(title: String, text: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CreateTitle(title = title)
        CreateText(text = text)
    }


}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CreateQuadrant(
                title = stringResource(R.string.first_title),
                text = stringResource(R.string.first_text),
                color = Color.Green,
                modifier = Modifier.weight(1f))
            CreateQuadrant(
                title = stringResource(R.string.second_title),
                text = stringResource(R.string.second_text),
                color = Color.Yellow,
                modifier = Modifier.weight(1f))
        }
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CreateQuadrant(
                title = stringResource(R.string.third_title),
                text = stringResource(R.string.third_text),
                color = Color.Cyan,
                modifier = Modifier.weight(1f))
            CreateQuadrant(
                title = stringResource(R.string.fourth_title),
                text = stringResource(R.string.fourth_text),
                color = Color.LightGray,
                modifier = Modifier.weight(1f))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    BirthdayAppTheme {
        ComposeQuadrant()
    }
}