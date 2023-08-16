package com.example.laboratorio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen1()
                }
            }
        }
    }
}

@Composable
fun Screen1(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Campus Central",
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(id = R.drawable.uvg),
            contentDescription = "UVG"
        )


        Column {
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "DESTACADOS",
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )

            Row(horizontalArrangement = Arrangement.Center) {
                Column(modifier = Modifier.weight(1f).padding(4.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.sn),
                        contentDescription = "UVG",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                    )
                    Text(
                        text = "Service Now",
                        modifier = Modifier
                            .background(Color(40,140,40))
                            .fillMaxWidth(),
                        color = Color.White
                    )
                }
                Column(modifier = Modifier.weight(1f).padding(4.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.actualidaduvg),
                        contentDescription = "UVG",
                        modifier = Modifier
                                .height(100.dp)
                                .align(CenterHorizontally)
                    )
                    Text(
                        text = "Actualidad UVG",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .fillMaxWidth(),
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "SERVICIOS Y RECURSOS",
                color = Color.Gray,
                fontWeight = FontWeight.Bold
            )

            Row(horizontalArrangement = Arrangement.Center) {
                Column(modifier = Modifier.weight(1f).padding(4.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.jack),
                        contentDescription = "UVG",
                        modifier = Modifier
                            .height(100.dp)
                            .align(CenterHorizontally)
                    )
                    Text(
                        text = "Directorio de Servicios Estudiantiles",
                        modifier = Modifier.background(Color(40,140,40)),
                        color = Color.White
                    )
                }
                Column(modifier = Modifier
                    .weight(1f)
                    .padding(4.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.biblio),
                        contentDescription = "UVG",
                        modifier = Modifier
                            .height(100.dp)
                    )
                    Text(
                        text = "Portal Web Bibliotecas UVG",
                        modifier = Modifier.background(Color.DarkGray),
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio4Theme {
        Screen1()
    }
}