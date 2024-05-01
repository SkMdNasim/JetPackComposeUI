package com.divii.jetpackcomposeui

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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.divii.jetpackcomposeui.ui.theme.JetPackComposeUITheme

class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

        ) {
        Text(
            text = "Hello $name!",
            modifier = modifier,
            color = Color.Blue
        )
        Text(
            text = "Some other text",
            modifier = modifier,
            color = Color.Red,
            fontSize = 20.sp
        )

        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Hello $name!",
                modifier = modifier,
                color = Color.Blue
            )
            Text(
                text = "Some other text",
                modifier = modifier,
                color = Color.Red,
                fontSize = 30.sp
            )
        }


        Box(contentAlignment = Alignment.BottomCenter,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Hello $name!",
                modifier = Modifier.align(Alignment.BottomEnd),
                color = Color.Blue
            )
            Text(
                text = "Some other text",
                modifier = modifier,
                color = Color.Red,
                fontSize = 30.sp
            )
        }

        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.background(color = Color.Black))



        /* GlideImage(
             imageModel = "https://i.pinimg.com/originals/4f/ae/53/4fae535ca7e76a966f7b432717cff19c.jpg",
             contentScale = ContentScale.Crop,
             circularReveal = CircularReveal(duration = 100),
             alignment = Alignment.Center,
             shimmerParams = ShimmerParams(
                 baseColor = Color.Gray,
                 highlightColor = Color.Gray,
                 durationMillis = 500,
                 dropOff = 0.55f,
                 tilt = 20f
             )
         )*/

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetPackComposeUITheme {
        Greeting2("Android")
    }
}
