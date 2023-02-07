package com.example.gmailclone.components

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.models.BottomMenuData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun BottomNavigationMenu(state:ScaffoldState,scope: CoroutineScope) {
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet
    )

    BottomNavigation(backgroundColor = Color.White) {
        items.forEach {
            BottomNavigationItem(selected = false, onClick = { scope.launch {
                state.snackbarHostState.showSnackbar(it.title)
            }},
                icon = { Icon(imageVector = it.icon, contentDescription = it.title) },
                alwaysShowLabel = true,
                label = { Text(text = it.title) })


        }
    }
}