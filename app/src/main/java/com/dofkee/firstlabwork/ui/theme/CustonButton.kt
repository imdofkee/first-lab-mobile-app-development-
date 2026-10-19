package com.dofkee.firstlabwork.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

enum class ButtonType {Based, Processing, Done}

@Composable
fun TemplateButton(
    modifier: Modifier,
    enabled: Boolean = true,
    buttonTypes: ButtonType = ButtonType.Based
) {
//    я вообще хз как оно работает но оно работает
    val color = when(buttonTypes) {
        ButtonType.Based -> MyOrange
        ButtonType.Processing -> MyPink
        ButtonType.Done -> MyBlue
    }

    Button(
        onClick = {},
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonColors(color, WhiteTextColor, BaseDisableColor, WhiteTextColor),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp, pressedElevation = 100.dp, focusedElevation = 100.dp, disabledElevation = 0.dp),
        contentPadding = PaddingValues(10.dp, 5.dp),
    ) {Text("Button")}
}

//class custom_components {
//}