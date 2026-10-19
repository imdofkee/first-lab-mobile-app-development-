package com.dofkee.firstlabwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.dp
import com.dofkee.firstlabwork.ui.theme.FirstLabWorkTheme

//COLORS
import com.dofkee.firstlabwork.ui.theme.BaseDisableColor
import com.dofkee.firstlabwork.ui.theme.MyBlue
import com.dofkee.firstlabwork.ui.theme.MyOrange
import com.dofkee.firstlabwork.ui.theme.MyPink
import com.dofkee.firstlabwork.ui.theme.WhiteTextColor

// CUSTOM ELEMENTS
import com.dofkee.firstlabwork.ui.theme.TemplateButton
import com.dofkee.firstlabwork.ui.theme.TemplateText


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstLabWorkTheme {
                //scaffold - отступы! (строительные леса) => оболочка
                //innerpadding - внутренний отступ
                //Modifier - ОСНОвной шаблон пустых стилей,
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    я хз но пусть будет
                    AllScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}



@Composable
fun AllScreen(modifier: Modifier) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TemplateText(modifier = Modifier.fillMaxWidth().padding(vertical = 30.dp))
        TemplateButton(modifier = Modifier.fillMaxWidth())
    }
}