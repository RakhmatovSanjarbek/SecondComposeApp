package sanjarbek.uz.composeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import sanjarbek.uz.composeapplication.custom.MyTextField
import sanjarbek.uz.composeapplication.custom.MyTopAppBar

class EditProfilePage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EditProfileScreen()
        }
    }
}

@Composable
private fun EditProfileScreen() {
    Scaffold(
        topBar = {
            MyTopAppBar(
                iconButton1 = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Check",
                            tint = Color.White
                        )
                    }
                },
                txt = "Profilni tahrirlash"
            )
        }
    ) { innerPadding ->
        EditProfileBody(innerPadding)
    }
}

@Composable
fun EditProfileBody(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding)) {
        Spacer(modifier = Modifier.height(12.dp))
        MyTextField("Foydalanuvchi nomi", "Kiriting...", Icons.Default.Person)
        Spacer(modifier = Modifier.height(12.dp))
        MyTextField("Paroli", "Kiriting...", Icons.Default.Lock)
    }
}


