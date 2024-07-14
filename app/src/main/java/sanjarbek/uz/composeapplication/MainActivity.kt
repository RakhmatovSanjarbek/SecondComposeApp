package sanjarbek.uz.composeapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sanjarbek.uz.composeapplication.ui.theme.ComposeApplicationTheme
import androidx.core.content.ContextCompat.startActivity
import sanjarbek.uz.composeapplication.custom.CustomButton
import sanjarbek.uz.composeapplication.custom.MyTopAppBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyScreen(context = LocalContext.current)
        }

    }
}

@Composable
fun MyScreen(context: Context = LocalContext.current) {
    Scaffold(
        topBar = {
            MyTopAppBar(
                iconButton1 = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = Color.White
                        )
                    }
                },
                iconButton2 = {
                    IconButton(onClick = {
                    }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "More",
                            tint = Color.White
                        )
                    }
                },
                "Sanjarbek"
            )
        }
    ) { innerPadding ->
        MyAppBody(innerPadding, "Sanjarbek Rakhmatov", context)
    }
}

@Composable
fun MyAppBody(innerPadding: PaddingValues, txt: String, context: Context = LocalContext.current) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.profile_image),
                contentDescription = "avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = txt,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(12.dp))
        HorizontalDivider(color = Color.Black, modifier = Modifier.padding(horizontal = 8.dp))
        Spacer(modifier = Modifier.height(12.dp))
        CustomButton(
            icon = Icons.Default.Edit,
            txt = "Profilni sozlash",
            myColor = Color(0xFF061CA7)
        ) {
            val intent = Intent(context, EditProfilePage::class.java)
            startActivity(context, intent, null)

        }
        Spacer(modifier = Modifier.height(12.dp))
        CustomButton(Icons.Default.Settings, "Sozlamalar", Color(0xFF061CA7), {})
        Spacer(modifier = Modifier.height(12.dp))
        CustomButton(Icons.AutoMirrored.Filled.ExitToApp, "Chiqish", Color(0xFF8B0404), {})
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeApplicationTheme {
        MyScreen()
    }
}