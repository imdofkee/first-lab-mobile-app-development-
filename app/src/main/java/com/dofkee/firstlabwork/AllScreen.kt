package com.dofkee.firstlabwork

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dofkee.firstlabwork.data.Calculator
import com.dofkee.firstlabwork.ui.theme.BaseColor
import com.dofkee.firstlabwork.ui.theme.BaseDisableColor
import com.dofkee.firstlabwork.ui.theme.BaseTextColor
import com.dofkee.firstlabwork.ui.theme.MyPink
import com.dofkee.firstlabwork.ui.theme.WhiteTextColor

@Composable
fun AllScreen(modifier: Modifier) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        TemplateText(modifier = Modifier.fillMaxWidth().padding(vertical = 30.dp))

        var text by remember { mutableStateOf("") }
        var output by remember {mutableStateOf("")}
        val textShape = RoundedCornerShape(12.dp)

        BasicTextField(
            value = text,
            onValueChange = { newValue ->
                // ToDO: прикрутить проверку на ввод цирф/фильтр ввода
                // что такое it тоже доразобрать
                text = newValue
                var digits: List<Int> = newValue.mapNotNull {it.digitToIntOrNull()}
                var output: List<Int> = Calculator.getSet(digits)
            },
            modifier = modifier
                .fillMaxWidth()
                .height(30.dp)
                .background(BaseColor, shape = textShape),
            enabled = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            cursorBrush = SolidColor(BaseTextColor),
            singleLine = true,
            textStyle = TextStyle(fontSize = 20.sp, textAlign = TextAlign.Start),
            decorationBox = {innerPadding -> Column(
                modifier = Modifier.padding(5.dp, 0.dp),
                verticalArrangement = Arrangement.Center,) {innerPadding()} },
        )

        Button(
            onClick = {
                ///
                var digits: List<Int> = text.mapNotNull {it.digitToIntOrNull()}
                output = Calculator.getSet(digits).toString()
            },
            modifier = modifier,
//            enabled = enabled,
            shape = RoundedCornerShape(20.dp),
            colors = ButtonColors(MyPink, WhiteTextColor, BaseDisableColor, WhiteTextColor),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp, pressedElevation = 100.dp, focusedElevation = 100.dp, disabledElevation = 0.dp),
            contentPadding = PaddingValues(10.dp, 5.dp),
        ) {Text(" Вывести результат ")}


        OutlinedTextField(
            value = output,
            onValueChange = {},
//            label = {Text("Result")},
            modifier = Modifier.fillMaxWidth()
        )
    }

}
