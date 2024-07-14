package sanjarbek.uz.composeapplication.custom

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    icon: ImageVector,
    txt: String,
    myColor: Color? = null,
    onClick: () -> Unit
) {
    val context = LocalContext.current

    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 24.dp),
        colors = ButtonDefaults.buttonColors(containerColor = myColor ?: Color.Blue),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row {
            Icon(
                imageVector = icon,
                contentDescription = txt,
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = txt, fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}