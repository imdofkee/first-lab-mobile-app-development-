package com.dofkee.firstlabwork.data


object Calculator {
    fun getSet(output: List<Int>) : List<Int> {
        return output.groupBy { it }.mapValues{it.value.size}.entries.sortedBy{it.value}.map{it.key}
    }
}

