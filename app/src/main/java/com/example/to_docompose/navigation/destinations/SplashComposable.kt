package com.example.to_docompose.navigation.destinations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideOutVertically
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import com.example.to_docompose.ui.screens.splash.SplashScreen
import com.example.to_docompose.util.Constants

@ExperimentalAnimationApi
@ExperimentalMaterialApi
fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = Constants.SPLASH_SCREEN,
        exitTransition = {
            slideOutVertically(
                targetOffsetY = { fullHeight -> -fullHeight },
                animationSpec = tween(
                    durationMillis = 300
                )
            )
        }
    ) {
        SplashScreen(
            navigateToListScreen = navigateToListScreen
        )
    }
}