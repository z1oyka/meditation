package com.example.meditatins

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.meditatins.ui.theme.MeditatinsTheme
import com.example.meditatins.Screen.Screen
import com.example.meditatins.Screen.ScreenThird
import com.example.meditatins.Screen.Screensecnd

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MeditatinsTheme {
                NavigationFun()


                
            }
        }
    }
}

@Composable
fun NavigationFun (modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "screen") {
        composable("screen") {
            Screen(
                navController=navController)



        }
        composable("screensecond") {
             Screensecnd(navController = navController)
        }
        composable("screenthird"){
            ScreenThird(navController = navController)
        }


    }

}

