package com.leetcode.longestcommonprefix

import android.util.Log
import androidx.lifecycle.ViewModel

class MyVewModel :ViewModel(){
val TAG = "RESULT"
    fun longestPrefix(){

        fun returnArray(str: String): Array<String> {
            return str.split(",").toTypedArray()
        }
        val array = returnArray(Data.words.value)

        var prefix = array[0]
        for(i in 1 until array.size){
            while (!array[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length-1)

                if (prefix.isEmpty()) {
                    Log.d(TAG, "EMPTY")
                    Data.result.value = ""

                }
            }
        }
        Log.d(TAG, prefix)
        Data.result.value = prefix

    }
}