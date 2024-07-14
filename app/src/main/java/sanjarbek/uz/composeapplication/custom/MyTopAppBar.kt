package sanjarbek.uz.composeapplication.custom

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(
    iconButton1: @Composable () -> Unit = {},
    iconButton2: @Composable () -> Unit = {},
    txt: String
) {
    TopAppBar(
        title = { Text(text = txt, color = Color.White) },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Blue),
        actions = {
            Row {
                iconButton1()
                iconButton2()
            }
        }
    )
}