package com.dofkee.firstlabwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.dofkee.firstlabwork.ui.theme.FirstLabWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstLabWorkTheme {
                //scaffold - отступы! (строительные леса) => оболочка
                //innerpadding - внутренний отступ
                //Modifier - Основной шаблон пустых стилей,
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AllScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}