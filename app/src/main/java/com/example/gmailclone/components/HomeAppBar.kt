package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gmailclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun HomeAppBar(scaffoldState: ScaffoldState, coroutineScope: CoroutineScope) {


    Box(modifier = Modifier.padding(10.dp)) {

        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = 10.dp,
            backgroundColor = Color(242, 242, 242)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                IconButton(onClick = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
                ) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }

                Text(
                    text = "Search in emails...",
                    modifier = Modifier.weight(2.0f),
                    color = Color.Gray
                )

                Image(
                    painter = painterResource(id = R.drawable.gmailiconpicture),
                    modifier = Modifier.size(80.dp),
                    contentDescription = "Profile Picture"
                )


            }
        }
    }
}

