package com.leetcode.longestcommonprefix.ui.theme

import android.renderscript.ScriptGroup.Input
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.leetcode.longestcommonprefix.Data
import com.leetcode.longestcommonprefix.MyVewModel

@Composable
fun Greeting(model: MyVewModel){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .wrapContentSize(Alignment.Center)
    ) {
        Text(text = "Input the Array separated by ','")
        Inputs()
        Send(model = model)
        Text(text = Data.result.value)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inputs(){
    var text by remember{ mutableStateOf("")}
    OutlinedTextField(
        value = text,
        onValueChange ={
            text = it
            Data.words.value = text.lowercase()
        },
        label = {
            Text(text = "Array")
        },
        modifier = Modifier.padding(top = 8.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = Color.Gray,
            textColor = Color.Black,
            cursorColor = Color.Black
        )

    )

}

@Composable
fun Send(model: MyVewModel){
    Button(onClick = {
        model.longestPrefix()
    }) {
        Text(text = "SEND")
    }
}