package com.dofkee.firstlabwork.ui.theme

//import android.widget.EditText
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun TemplateText(modifier: Modifier) {
    var text by remember { mutableStateOf("") }
    val textShape = RoundedCornerShape(12.dp)


    BasicTextField(
        value = text,
        onValueChange = {
            // ToDO: прикрутить проверку на ввод цирф/фильтр ввода
            // что такое it тоже доразобрать
            text = it},
        modifier = modifier.fillMaxWidth().height(30.dp).background(BaseColor, shape = textShape),
        enabled = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//        onKeyboardAction = KeyboardOptions {
//            AfterDone = {
//                Text("test")
//            }
//        },
        cursorBrush = SolidColor(BaseTextColor),
        singleLine = true,
        textStyle = TextStyle(fontSize = 20.sp, textAlign = TextAlign.Start),
        decorationBox = {innerPadding -> Column(
            modifier = Modifier.padding(5.dp, 0.dp),
            verticalArrangement = Arrangement.Center,

            ) {innerPadding()} }

    )
}