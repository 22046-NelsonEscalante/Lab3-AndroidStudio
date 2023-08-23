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
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.
        background(Color.Gray)
    ) {
        Row(modifier = Modifier
            .background(Color.White)
            .fillMaxWidth(1f),
            horizontalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.cancel),
                contentDescription = "Cancel",
                modifier = Modifier.size(15.dp)
            )
            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.background(Color.White)
            )
        }
        Column() {
            Row(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.pfp),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "Edit Profile",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Row(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.email),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "Email Addresses",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Row(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.bell),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "Notifications",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Row(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.invisible),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "Privacy",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Spacer(modifier = Modifier
                .background(Color.Gray)
                .height(20.dp)
            )

            Row(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.help),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "Help and Feedback",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Row(modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(1f)) {
                Image(
                    painter = painterResource(id = R.drawable.info),
                    contentDescription = null,
                    modifier = Modifier.size(15.dp)
                )
                Text(
                    text = "About",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Spacer(modifier = Modifier
                .background(Color.Gray)
                .height(20.dp)
            )

            Row(horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(1f)) {
                Text(
                    text = "Logout",
                    color = Color.Red,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(5.dp)
                )
            }

            Spacer(modifier = Modifier
                .background(Color.Gray)
                .height(60.dp)
            )
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