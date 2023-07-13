package com.example.agro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agro.ui.theme.AgroTheme

class QuadrantsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgroTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreateQuadrant()
                }
            }
        }
    }
}



@Composable
fun CreateQuadrant(modifier: Modifier = Modifier)
{

    Column(Modifier.fillMaxSize())
    {

        Row(Modifier.weight(1f)) {
            GridForDisplay(title = "First", Description ="Nothing" , bcolour = Color.Cyan, modifier = Modifier.weight(1f))
            GridForDisplay(title = "Second", Description ="Nothing" , bcolour = Color.Cyan, modifier = Modifier.weight(1f))
        }


        Row(Modifier.weight(1f)) {
            GridForDisplay(title = "Third", Description ="Nothing" , bcolour = Color.Cyan, modifier = Modifier.weight(1f))
            GridForDisplay(title = "fourth", Description ="Nothing" , bcolour = Color.Cyan, modifier = Modifier.weight(1f))
        }

    }
}

@Composable
fun GridForDisplay(title : String , Description : String ,
                   bcolour : Color ,
                   modifier: Modifier = Modifier )
{
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(bcolour)
            .padding(16.dp),
        contentAlignment = Alignment.Center

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = title, fontWeight = FontWeight.Bold)
            Text(text = Description, textAlign = TextAlign.Justify)
        }
    }
}


@Composable
fun CreateownQuadrant()
{
    Column(Modifier.fillMaxSize()) {

        Row(Modifier.weight(0.2f)) {

            GridForDisplay(
                title = "No1 ",
                Description = "Nothing",
                bcolour = Color.Cyan,
                modifier = Modifier.weight(0.4f)

            )
        }
        Row(Modifier.weight(1f))
        {
            GridForDisplay(title ="No2" ,
                Description ="Nothing" ,
                bcolour = Color.Gray,
                modifier = Modifier.weight(0.6f)

            )

        }

        Row(Modifier.weight(1f)) {

            GridForDisplay(title = "No3 ",
                Description = "Nothing",
                bcolour = Color.LightGray,
                modifier = Modifier.weight(1f)
            )


            GridForDisplay(title ="No4" ,
                Description ="Nothing" ,
                bcolour = Color.DarkGray,
                modifier = Modifier.weight(1f)
            )

        }
        Row(Modifier.weight(1f)) {

            GridForDisplay(title = "No5 ",
                Description = "Nothing",
                bcolour = Color.Cyan,
                modifier = Modifier.weight(1f)
            )


            GridForDisplay(title ="No6" ,
                Description ="Nothing" ,
                bcolour = Color.Yellow,
                modifier = Modifier.weight(1.6f)
            )

        }



    }
}



@Preview(showBackground = true , showSystemUi = true)
@Composable
fun QuadrantsPreview() {
    AgroTheme {
        CreateownQuadrant()
    }
}
