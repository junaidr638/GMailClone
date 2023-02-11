package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.gmailclone.R

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false}) {

        ProfileDialogUI()

    }
}

@Composable
fun ProfileDialogUI() {
    Card(
        backgroundColor = Color.White,
        modifier = Modifier.wrapContentHeight(Alignment.CenterVertically)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.padding(2.dp)) {
                Icon(
                    imageVector = Icons.Outlined.Close,
                    contentDescription = "Close dialog",
                    modifier = Modifier.padding(top = 20.dp)
                )

                Spacer(modifier = Modifier.width(110.dp))

                Image(
                    painter = painterResource(id = R.drawable.googlelogo),
                    contentDescription = "Google Logo",
                    modifier = Modifier.size(70.dp)

                )
            }

            Row(modifier = Modifier.padding()) {
                Image(
                    painter = painterResource(id = R.drawable.profile_icon),
                    contentDescription = "Profile Icon",
                    Modifier.size(50.dp)
                )

                Column(modifier = Modifier.padding(5.dp)) {
                    Text(
                        text = "Junaid Rehman",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        text = "junaidr638@gmail.com",
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp
                    )
                }
                Spacer(modifier = Modifier.width(80.dp))
                Text(
                    text = "99+",
                    modifier = Modifier.padding(top = 27.dp),
                    color = Color.Gray,
                    fontSize = 12.sp


                )
            }

            Row(modifier = Modifier.padding(bottom = 20.dp)) {
                Spacer(modifier = Modifier.width(40.dp))
                Text(
                    text = "  Manage your Google Account  ",
                    modifier = Modifier
                        .border(1.dp, color = Color.Gray, RoundedCornerShape(20.dp))
                        .padding(5.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Divider(modifier = Modifier.padding(bottom = 20.dp))

            Row(modifier = Modifier.padding(bottom = 15.dp, start = 15.dp)) {
                Icon(imageVector = Icons.Outlined.Cloud, contentDescription = "Cloud Icon")
                Spacer(modifier = Modifier.width(30.dp))
                Text(text = "Storage used: 54% of 100 GB",
                    fontSize = 12.sp)
            }

            Divider(modifier = Modifier.padding(bottom = 20.dp))

            Column {

                Row(modifier = Modifier.padding(bottom = 20.dp, start = 15.dp)) {
                    Icon(
                        imageVector = Icons.Outlined.PersonAddAlt,
                        contentDescription = "Add another account"
                    )

                    Spacer(modifier = Modifier.width(30.dp))
                    Text(
                        text = "Add another account",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                }

                Row(modifier = Modifier.padding(start = 15.dp, bottom = 15.dp)) {
                    Icon(
                        imageVector = Icons.Outlined.ManageAccounts,
                        contentDescription = "Manage accounts on this device"
                    )

                    Spacer(modifier = Modifier.width(30.dp))

                    Text(
                        text = "Manage accounts on this device",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )


                }

            }

            Divider(modifier = Modifier.padding(bottom = 20.dp))

            Row(modifier = Modifier.padding(bottom = 8.dp)) {
                Spacer(modifier = Modifier.width(30.dp))
                Text(text = "Privacy Policy", fontSize = 12.sp)
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "·",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 16.sp,
                    )
                Spacer(modifier = Modifier.width(20.dp))
                Text(text = "Terms of service", fontSize = 12.sp)
            }


        }
    }

}


@Preview(showBackground = true)
@Composable
fun DialogPreview() {
    ProfileDialogUI()
}
