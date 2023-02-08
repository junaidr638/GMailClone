package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.models.MockMailData
import com.example.gmailclone.models.list

@Composable
fun MailList(scrollState: ScrollState) {
  LazyColumn( modifier = Modifier
      .fillMaxSize()
      .scrollable(scrollState,Orientation.Vertical)){
      items(items = list , itemContent = {
          item -> MailItem(mail = item)
      })
  }

}

@Composable
fun MailItem(mail: MockMailData) {
    Box(modifier = Modifier.fillMaxWidth()) {
       Row(modifier = Modifier.padding(8.dp)) {
           Card(shape = CircleShape,
               modifier = Modifier
                   .size(50.dp)
                   .padding(1.dp),
               backgroundColor = Color.Gray,

               ) {
               Text(text = mail.sender[0].toString(),
                   modifier = Modifier.padding(8.dp),
                   fontWeight = FontWeight.ExtraBold,
                   fontSize = 30.sp,
                   textAlign = TextAlign.Center)
           }
           Column(modifier = Modifier
               .padding(start = 8.dp, bottom = 8.dp)
               .weight(4f)) {
               Text(text = mail.sender,
                   fontWeight = FontWeight.Bold,
                   fontSize = 16.sp ,
                   modifier = Modifier.padding(2.dp))
               Text(text = mail.subject,
                   fontWeight = FontWeight.Bold,
                   fontSize = 13.sp,
                   modifier = Modifier.padding(horizontal = 2.dp))
               Text(text = mail.body,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(horizontal = 2.dp)
               )
           }
           
           Column(modifier = Modifier.weight(1f) ) {
               Text(text = mail.timestamp,
                    fontSize = 14.sp)
               IconButton(onClick = { /*TODO*/ }) {
                   Icon(imageVector = Icons.Outlined.StarOutline,
                       contentDescription = "Favorites",
                       Modifier.size(20.dp))
               }
           }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MailItemPreview() {
    MailItem(mail = tempMail)
}

val tempMail = MockMailData(
    0,
    "Junaid",
    "This is regarding placement at LemonVb..",
    "We are pleased to inform you that you ...",
    "22:32"
)