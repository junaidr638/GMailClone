package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FloatingButton(scrollState: ScrollState) {

    if (scrollState.value > 100) {
        ExtendedFloatingActionButton(text = {
            Text(text = "Compose")
        }, onClick = { /*TODO*/ },
            icon = {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Compose new mail"
                )
            },
           modifier = Modifier.background(MaterialTheme.colors.surface))
    } else {
        FloatingActionButton(onClick = { /*TODO*/ }, modifier = Modifier.background(MaterialTheme.colors.surface)) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "Compose new mail")
        }
    }
}