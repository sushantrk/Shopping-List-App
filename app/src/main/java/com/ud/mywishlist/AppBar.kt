package com.ud.mywishlist

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun AppBarView(
    title:String,
    onBackNavClicked:() -> Unit={}
){
    val navigationIcon : (@Composable ()-> Unit )? =
        {
            if(!title.contains("Shopping List")){
                IconButton(onClick = { onBackNavClicked() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack
                        , contentDescription =null,
                        tint = Color.White
                    )
                }
            }else{
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart
                        , contentDescription =null,
                        tint = Color.White
                    )
                }
            }

        }



    TopAppBar(title = {
        Text(text = title,
            color = colorResource(id = R.color.white),
            modifier = Modifier
                .padding(4.dp)
                .heightIn(max = 24.dp)) },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.green),
        navigationIcon = navigationIcon
    )
}