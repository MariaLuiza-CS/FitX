package com.example.fitx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.example.fitx.ui.theme.FitXTheme

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {

    var keepSplashOpened = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().setKeepOnScreenCondition{
            keepSplashOpened
        }
        setContent {
            FitXTheme {
                RootNavigationGraph(navController =  rememberNavController(), startDestination = Graph.PERSONAL_SCREEN)
                keepSplashOpened = false
            }
        }
    }
}
