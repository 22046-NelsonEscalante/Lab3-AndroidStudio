package com.example.laboratorio4

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laboratorio4.ui.theme.Laboratorio4Theme

class MainMenu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu()
                }
            }
        }
    }
}

@Composable
fun Menu(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Row(modifier = Modifier
            .background(Color(40,140,40))
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(
                containerColor = Color(20,80,20)
                ),
                modifier = Modifier.padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Pantalla 1",
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(modifier = Modifier
            .background(Color(40,140,40))
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity2::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(20,80,20)
                ),
                modifier = Modifier.padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Pantalla 2",
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(modifier = Modifier
            .background(Color(40,140,40))
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Button(
                onClick = {
                    val intent = Intent(context, MainActivity3::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(20,80,20)
                ),
                modifier = Modifier.padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Pantalla 3",
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    Laboratorio4Theme {
        Menu()
    }
}