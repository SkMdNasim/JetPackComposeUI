package com.divii.jetpackcomposeui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.divii.jetpackcomposeui.ui.theme.JetPackComposeUITheme
import com.skydoves.landscapist.CircularReveal
import com.skydoves.landscapist.ShimmerParams
import com.skydoves.landscapist.glide.GlideImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

        ) {
        Button(onClick = {
            context.startActivity(Intent(context, FirstActivity::class.java))
        }) {
            Text(text = "First Activity")
        }
        Button(onClick = {
            context.startActivity(Intent(context, ButtonActivity::class.java))
        }) {
            Text(text = "Button Activity")
        }

        Button(onClick = {
            context.startActivity(Intent(context, LazyColoumActivity::class.java))
        }) {
            Text(text = "LazyColumn Activity")
        }

        Button(onClick = {
            context.startActivity(Intent(context, StateManagemantActivity::class.java))
        }) {
            Text(text = "Basic of State Activity")
        }

        Button(onClick = {
            context.startActivity(Intent(context, StateWithTextFuildActivity::class.java))
        }) {
            Text(text = "State With Text Field Activity")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeUITheme {
        Greeting("Android")
    }
}
