package com.example.tangercartvisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tangercartvisite.ui.theme.TangerCartVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TangerCartVisiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    CarteVisite()
                }
            }
        }
}
}

@Composable
fun CarteVisite() {
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.tanger_cor),
            contentDescription = "Tanger",
            Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.grotte), contentDescription = "grotte")
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Tanger")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TangerCartVisiteTheme {
        CarteVisite()
    }
}


//@Composable
//fun MyScreen() {
//    // Use Box to position the background image behind the Column
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        // Set the background image using Modifier.background
//        Image(
//            painter = painterResource(id = R.drawable.your_image),
//            contentDescription = "Your image description",
//            modifier = Modifier.fillMaxSize() // Stretch the image to fill the Box
//        )
//
//        // Define the Column content on top of the background image
//        Column(
//            modifier = Modifier
//                .fillMaxSize() // Ensures the Column fills the remaining space
//                .padding(16.dp), // Add some padding for visual appeal
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "Mon titre")
//            Spacer(modifier = Modifier.height(16.dp))
//            // Add more content to your Column as needed
//        }
//    }
//}