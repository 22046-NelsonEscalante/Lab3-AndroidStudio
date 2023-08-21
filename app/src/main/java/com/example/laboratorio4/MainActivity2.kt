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

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Screen2()
                }
            }
        }
    }
}

@Composable
fun Screen2(modifier:Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Image(
                painter = painterResource(id = R.drawable.cancel),
                contentDescription = "Cancel"
            )
            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold
            )
        }
        Column() {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.pfp),
                    contentDescription = null,
                )
                Text(
                    text = "Edit Profile"
                )
            }

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                )
                Text(
                    text = "Email Addresses"
                )
            }

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.bell),
                    contentDescription = null,
                )
                Text(
                    text = "Notifications"
                )
            }

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.invisible),
                    contentDescription = null,
                )
                Text(
                    text = "Privacy"
                )
            }

            Spacer(modifier = Modifier.background(Color.Gray))

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.help),
                    contentDescription = null,
                )
                Text(
                    text = "Help and Feedback"
                )
            }

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.info),
                    contentDescription = null,
                )
                Text(
                    text = "About"
                )
            }

            Spacer(modifier = Modifier.background(Color.Gray))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Logout",
                    color = Color.Red
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Laboratorio4Theme {
        Screen2()
    }
}