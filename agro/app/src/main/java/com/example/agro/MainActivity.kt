package com.example.agro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    GreetingImage(message = getString(R.string.welcome_note) , from = getString(R.string.simp))
                }
            }
        }
    }
}

@Composable
fun GreetingText(  modifier: Modifier = Modifier ,message: String = "you", from : String)
{

Column(verticalArrangement = Arrangement.Center , modifier = Modifier.padding(8.dp,), horizontalAlignment = Alignment.CenterHorizontally
)
{
    Text(text = message , fontSize = 90.sp , lineHeight = 120.sp , textAlign = TextAlign.Center, modifier = Modifier.padding(top =160.dp), color = Color.White   )
    Text(text = ("- From $from") , fontSize = 20.sp , color = Color.White ,modifier = Modifier
        .padding(16.dp)
        .align(alignment = Alignment.End))
}

}

@Composable
fun GreetingImage(message: String , from: String , modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.agreion)
    Box {
        Image(painter = image, contentDescription = null , contentScale = ContentScale.Crop, alpha =0.75F)
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun AgreionWelcomePreview() {
    AgroTheme {
        GreetingImage(message = stringResource(id = R.string.welcome_note) , from = stringResource(
            id = R.string.simp
        ))
    }
}