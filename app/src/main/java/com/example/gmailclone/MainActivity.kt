package com.example.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gmailclone.components.*
import com.example.gmailclone.ui.theme.GMailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GMailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember{ mutableStateOf(true) }
    Scaffold(topBar = { HomeAppBar(scaffoldState,coroutineScope,openDialog) },
              drawerContent = {
                  GmailDrawerMenu(scrollState = scrollState)
              },
          bottomBar = { BottomNavigationMenu(scaffoldState,coroutineScope) } ,
          floatingActionButton = { FloatingButton(scrollState = scrollState)}) {
        MailList(scrollState)
        it
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GMailCloneTheme {
      GmailApp()
    }
}