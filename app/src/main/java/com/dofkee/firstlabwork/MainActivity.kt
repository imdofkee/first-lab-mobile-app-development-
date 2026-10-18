package com.dofkee.truefirstlabwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstLabWorkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TemplateButton(
                        modifier = Modifier.padding(innerPadding).fillMaxWidth().padding(vertical = 20.dp)
                    )
                }
            }
        }
    }
}




