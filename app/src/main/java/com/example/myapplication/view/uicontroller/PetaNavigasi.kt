package com.example.myapplication.view.uicontroller





import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.view.EntrySiswaScreen
import com.example.myapplication.view.HomeScreen
import com.example.myapplication.view.route.DestinasiHome
import com.example.myapplication.view.route.DestinasiEntry

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}

