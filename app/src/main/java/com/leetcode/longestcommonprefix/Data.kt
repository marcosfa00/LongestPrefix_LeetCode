package com.leetcode.longestcommonprefix

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

object Data {

    val words: MutableState<String> = mutableStateOf("")
    var result : MutableState<String> = mutableStateOf("")
}