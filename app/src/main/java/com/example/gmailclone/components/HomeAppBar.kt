package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.R

@Composable
fun HomeAppBar() {

    Box(modifier = Modifier.padding(10.dp)) {

        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }

                Text(
                    text = "Search in emails",
                    modifier = Modifier.weight(2.0f)
                )

                Image(painter = painterResource(id = R.drawable.gmailiconpicture),
                       contentDescription = "Profiel Picture")


            }
        }
    }
}


@Preview
@Composable

fun AppBarPreview() {
    HomeAppBar()
}