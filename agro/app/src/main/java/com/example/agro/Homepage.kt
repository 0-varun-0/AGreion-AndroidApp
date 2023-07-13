package com.example.agro

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agro.ui.theme.AgroTheme

class Homepage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgroTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoadScreen()
                }
            }
        }
    }
}

@Composable
fun LoadScreen() {

Column(
    Modifier
        .fillMaxSize()
        .padding(20.dp) ) {

    var x=7

    do {
        Row(
            Modifier
                .weight(1f)
                .padding(top = 14.dp)
                .clip(RoundedCornerShape(30.dp)),

            verticalAlignment = Alignment.Top

        )
        {
            Blocc(Modifier.weight(1f))
        }
        x--
    }while (x > 0)



}

}




@Composable
fun Blocc(modifier: Modifier)
{
    val image = painterResource(R.drawable.agreion)

        Column(
            Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(50.dp))
                .background(Color.Cyan))
        {

            Row(Modifier.padding()) {


                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(80.dp, 80.dp)
                        .clip(RoundedCornerShape(100.dp))


                )
                Text(text = "Name" , fontSize = 25.sp, modifier = Modifier.padding(25.dp))

            }




        }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    AgroTheme {
        LoadScreen()
    }
}