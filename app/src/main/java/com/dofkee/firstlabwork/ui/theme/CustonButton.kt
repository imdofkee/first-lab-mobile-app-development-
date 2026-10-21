//package com.dofkee.firstlabwork.ui.theme
//
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonColors
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//enum class ButtonType {Based, Processing, Done}
//
//@Composable
//fun TemplateButton(
//    modifier: Modifier,
//    enabled: Boolean = true,
//    buttonTypes: ButtonType = ButtonType.Based
//) {
////    я вообще хз как оно работает но оно работает
//    val color = when(buttonTypes) {
//        ButtonType.Based -> MyOrange
//        ButtonType.Processing -> MyPink
//        ButtonType.Done -> MyBlue
//    }
////    АНИМИРОВАННЫЙ ЦВЕТ
////    val infiniteTransition = rememberInfiniteTransition(label = "infinite")
////
////    val animatedColor by infiniteTransition.animateColor(
////        initialValue = MyOrange,
////        targetValue = MyPink,
////        animationSpec = infiniteRepeatable(
////            animation = tween(1000, easing = LinearEasing),
////            repeatMode = RepeatMode.Reverse
////        ),
////        label = "color"
////    )
//
//    Button(
//        onClick = {
//            output = BubbleSort.runSort(input)
//        },
//        modifier = modifier,
//        enabled = enabled,
//        shape = RoundedCornerShape(20.dp),
//        colors = ButtonColors(color, WhiteTextColor, BaseDisableColor, WhiteTextColor),
//        elevation = ButtonDefaults.buttonElevation(defaultElevation = 3.dp, pressedElevation = 100.dp, focusedElevation = 100.dp, disabledElevation = 0.dp),
//        contentPadding = PaddingValues(10.dp, 5.dp),
//    ) {Text("Button")}
//}
//
//
//
////class custom_components {
////}
//
//
////@Composable
////fun AnimatedColorBox() {
////    val infiniteTransition = rememberInfiniteTransition(label = "infinite")
////
////    val animatedColor by infiniteTransition.animateColor(
////        initialValue = MyOrange,
////        targetValue = MyPink,
////        animationSpec = infiniteRepeatable(
////            animation = tween(1000, easing = LinearEasing),
////            repeatMode = RepeatMode.Reverse
////        ),
////        label = "color"
////    )
////
////    Box(
////        modifier = Modifier
////            .size(100.dp)
////            .backgrounbd(animatedColor)
////    )
////}