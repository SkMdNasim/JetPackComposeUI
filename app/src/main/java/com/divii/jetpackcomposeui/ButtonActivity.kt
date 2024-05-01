package com.divii.jetpackcomposeui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.divii.jetpackcomposeui.ui.theme.JetPackComposeUITheme

class ButtonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

        ) {
        Button(onClick = {
            //your onclick code here
        }) {
            Text(text = "Simple Button")
        }

        Button(onClick = {
            //your onclick code
        },
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
           )

        {
            Text(text = "Button with gray background",color = Color.White)
        }

        Button(onClick = {
            //your onclick code here
        }) {
            Text(text = "Click ", color = Color.Magenta)
            Text(text = "Here", color = Color.Green)
        }

        Button(onClick = {}) {
            Image(
                painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription ="Cart button icon",
                modifier = Modifier.size(20.dp))

            Text(text = "Add to cart",Modifier.padding(start = 10.dp))
        }

        Button(onClick = {}, shape = RectangleShape) {
            Text(text = "Rectangle shape")
        }

        Button(onClick = {}, shape = RoundedCornerShape(20.dp)) {
            Text(text = "Round corner shape")
        }

        Button(onClick = {}, shape = CutCornerShape(10)) {
            Text(text = "Cut corner shape")
        }

        Button(
            onClick = {
                //your onclick code
            },
            border = BorderStroke(1.dp, Color.Red),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Green)
        ) {
            Text(text = "Button with border", color = Color.DarkGray)
        }

        Button(onClick = {
            //your onclick code here
        },elevation =  ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )) {
            Text(text = "Button with elevation")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    JetPackComposeUITheme {
        Greeting3("Android")
    }
}
