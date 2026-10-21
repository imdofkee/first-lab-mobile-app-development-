package com.dofkee.firstlabwork.data

//import androidx.compose.runtime.Composable

object Calculator {
    fun getSet(output: List<Int>) : List<Int> {
//        output.toSet()
//        for (i in output) {
//
//        }
            return output.toSet().sorted()
    }
}

