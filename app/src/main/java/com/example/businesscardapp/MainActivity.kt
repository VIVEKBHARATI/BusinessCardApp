package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.material3.Icon as Icon1

//import com.example.businesscardapp.uiBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    BusinessInfo(
        name = stringResource(R.string.devname),
        profile = stringResource(R.string.profile),
        phone = stringResource(R.string.phoneNum),
        email = stringResource(R.string.email),
        place = stringResource(R.string.place)
    )
}



@Composable
fun BusinessInfo(name: String, profile: String, phone: String, email: String, place: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color.Transparent)
    ) {
        Column(
            modifier = modifier.
            fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier
                    .height(100.dp)
                    .width(100.dp)
                    .background(color = Color.Black)
            )
            Text(
                text = name,
                fontWeight = FontWeight.Thin,
                modifier = modifier
                    .padding(4.dp),
                fontSize = 40.sp,
                textAlign = TextAlign.Justify
            )
            Text(
                text = profile,
                color = Color(0xFF3ddc84),
                modifier = modifier,
                textAlign = TextAlign.Justify
            )
        }
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Icon1(
                    Icons.Rounded.Call,
                    tint = Color.Green,
                contentDescription = "Localized description",
                    modifier = modifier
                        .padding(4.dp)
                )
                Text(
                    text = phone,
                    modifier = modifier
                        .padding(4.dp),
                    textAlign = TextAlign.Justify
                )
            }
            Row {
                Icon1(
                    Icons.Rounded.MailOutline,
                    tint = Color.Green,
                    contentDescription = "Localized description",
                    modifier = modifier
                        .padding(4.dp)
                )

                Text(
                    text = email,
                    modifier = modifier
                        .padding(start = 4.dp),
                    textAlign = TextAlign.Justify
                )
            }
            Row {
                Icon1(
                    Icons.Rounded.Place,
                    tint = Color.Green,
                    contentDescription = "Localized description",
                    modifier = modifier.padding(4.dp)
                )
                Text(
                    text = place,
                    modifier = modifier
                        .padding(4.dp, bottom = 32.dp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}