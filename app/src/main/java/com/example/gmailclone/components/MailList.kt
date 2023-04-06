package com.example.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.mailList
import com.example.gmailclone.model.MailData

@Composable
fun MailList(paddingValues: PaddingValues, scrollState: ScrollState){
    Box(modifier = Modifier.padding(paddingValues)){

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .scrollable(scrollState, Orientation.Vertical)){
            items(mailList){
                MailData ->
                MailItem(mailData = MailData)
            }
        }
    }
}

@Composable
fun MailItem(mailData: MailData, modifier: Modifier=Modifier){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 8.dp)

    ) {
        Card(modifier = Modifier
            .padding(end = 8.dp)
            .size(40.dp)
            .clip(CircleShape),
        backgroundColor = Color.Gray){
            Text(text=mailData.userName[0].toString(),
                textAlign = TextAlign.Center, modifier = Modifier.padding(8.dp) )
        }

        Column(Modifier.weight(2.0f)) {
            Text(
                text = mailData.userName,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = mailData.subject,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = mailData.body,
                fontSize = 14.sp

            )

        }

        Column {
            Text(text = mailData.timeStamp)
            IconButton(onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 16.dp)) {
                Icon(imageVector = Icons.Outlined.StarOutline, contentDescription="")
            }


        }
    }
}

@Preview
@Composable
fun MailItemPreview(){
    MailItem(
        mailData = MailData(
            mailId = 4,
        userName ="Angelo",
        subject = "Email regarding something important",
            body = "This is regaring an important oppoirtunity",
            timeStamp = "22;22"
    )
    )
}
