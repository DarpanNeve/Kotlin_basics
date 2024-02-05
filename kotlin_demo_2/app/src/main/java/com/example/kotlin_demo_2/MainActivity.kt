package com.example.kotlin_demo_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kotlin_demo_2.ui.theme.Kotlin_demo_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_demo_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android", "new")
                    
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, from: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan, modifier = modifier) {
        Column {
            Row {
                Text(
                    text = message,
                    fontSize = 36.sp,
                    lineHeight = 116.sp,
                )
                Text(
                    text = from,
                    fontSize = 36.sp
                )
            }
            GreetingImage()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Kotlin_demo_2Theme {
        Greeting("Android ", "now")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun BirthdayCardPreview(){
//    HappyBirthdayTheme {
//        Greeting(name = "Android")
//    }
//}
@Composable
fun GreetingImage()
{
    val image= painterResource(id = R.drawable.androidparty)
    Image(painter = image, contentDescription = "hello world")
}

