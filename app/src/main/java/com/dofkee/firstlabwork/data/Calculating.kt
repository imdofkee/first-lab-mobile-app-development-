package com.dofkee.firstlabwork.data

import androidx.compose.runtime.Composable

object Calculator {
    fun getSet(output: List<Int>) : List<Int> {
//        output(",")
//        for (i in output) {
//
//        }
//            return output.toSet().sorted()
        return output.groupBy { it }.mapValues{it.value.size}.entries.sortedBy{it.value}.map{it.key}
    }
}

