package com.example.agro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agro.ui.theme.AgroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Welcome to AGreion" , from = "Varun")
                }
            }
        }
    }
}

@Composable
fun GreetingText(  modifier: Modifier = Modifier ,message: String = "you", from : String)
{
Column(verticalArrangement = Arrangement.Center , modifier = Modifier.padding(8.dp)
)
{
    Text(text = message , fontSize = 90.sp , lineHeight = 120.sp , textAlign = TextAlign.Center)
    Text(text = ("- From $from") , fontSize = 20.sp , modifier = Modifier.padding(16.dp).align(alignment = Alignment.End))
}
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun AgreionWelcomePreview() {
    AgroTheme {
        GreetingText(message = "Welcome to AGreion" , from = "Varun")
    }
}