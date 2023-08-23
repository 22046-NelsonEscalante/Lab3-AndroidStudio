package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen3()
                }
            }
        }
    }
}

@Composable
fun Screen3(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxHeight()) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.cancel),
                contentDescription = "Cancel",
                modifier = Modifier.size(15.dp)
            )

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Emergency Contacts",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(CenterHorizontally)
                )
            }
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.danger),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

                Column() {
                    Text(
                        text = "Emergencias"
                    )

                    Text(
                        text = "Si se presenta un incidente o percance, por favor, marca al número de emergencia.",
                        color = Color.Gray
                    )
                }

                //Spacer(modifier = Modifier.height(15.dp))



                //Spacer(modifier = Modifier.height(15.dp))
            }
        }

        Row(modifier.background(color = Color(40,140,40)).fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.phone),
                contentDescription = null,
                modifier = Modifier.size(15.dp)
            )

            Text(
                text = "Call Emergency Number",
                color = Color.White
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.info),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )

                Column() {
                    Text(
                        text = "Clínica UVG"
                    )

                    Text(
                        text = "La clínica UVG presta sus servicios a los miembros de la comunidad UVG.",
                        color = Color.Gray
                    )
                }
            }
        }

        Row(modifier.background(color = Color(40,140,40)).fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.phone),
                contentDescription = null,
                modifier = Modifier.size(15.dp)
            )

            Text(
                text = "Call Clinic Number",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Laboratorio4Theme {
        Screen3()
    }
}