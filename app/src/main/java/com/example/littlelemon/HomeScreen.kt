package com.example.littlelemon

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val cartScope = rememberCoroutineScope()

    Scaffold (
        scaffoldState = scaffoldState,
        drawerContent = {
            LeftDrawablePanel(
                scaffoldState,scope
            )
            RightKartPanel(
                scaffoldState = scaffoldState,
                scope = cartScope,
            )
        },
        topBar = {
            TopAppBar(
                scaffoldState,scope,cartScope
            )
        }
    ){
        Column {
            UpperPanel()
            LowerPanel(navController, DishRepository.dishes)
        }
    }

}
