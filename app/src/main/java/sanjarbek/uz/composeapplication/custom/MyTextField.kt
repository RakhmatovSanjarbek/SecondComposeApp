package sanjarbek.uz.composeapplication.custom

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun MyTextField(
    labelTxt: String,
    placeholderTxt: String,
    leadingIcon: ImageVector,
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(labelTxt) },
        placeholder = { Text(placeholderTxt) },
        leadingIcon = { Icon(leadingIcon, contentDescription = null) },
        modifier = Modifier
            .fillMaxWidth()
            .width(40.dp)
            .padding(horizontal = 16.dp),
        shape = RoundedCornerShape(12.dp)
    )
}