package com.example.agro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agro.ui.theme.ui.theme.AgroTheme

class About : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(stringResource(R.string.Name_user))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val image = painterResource(id = R.drawable.farm)

            Column {


                Image(painter = image, contentDescription = null, modifier = Modifier.size(height = 150.dp, width = 600.dp))

                Text(
                    text = "Hello $name!",
                    modifier = Modifier.padding(16.dp),
                    fontSize = 44.sp
                )
                Text(text = stringResource(R.string.short_description) ,modifier = Modifier.padding(24.dp), textAlign = TextAlign.Justify)
                Text(text = stringResource(R.string.long_Description) ,modifier = Modifier.padding(24.dp), textAlign = TextAlign.Justify)
            }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AgroTheme {
        Greeting(stringResource(R.string.Name_user))
    }
}