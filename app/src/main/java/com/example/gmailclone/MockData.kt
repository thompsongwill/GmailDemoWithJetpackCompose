package com.example.gmailclone


import android.accounts.Account
import com.example.gmailclone.model.Accounts
import com.example.gmailclone.model.MailData

val mailList = listOf(
    MailData(
        mailId = 1,
        userName = "Queen",
        subject = "Weekly Android News",
        body = "Hello Queen we have got exciting addition to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 2,
        userName = "Uche Daniel",
        subject = "Weekly IOS News",
        body = "Hello Daniel we have got exciting addition to the IOS api",
        timeStamp = "11:10"
    ),
    MailData(
        mailId = 3,
        userName = "Christy",
        subject = "Weekly Window News",
        body = "Hello Christy we have got exciting addition to the Windows api",
        timeStamp = "17:14"
    ),
    MailData(
        mailId = 4,
        userName = "Emmanuel",
        subject = "The Burial on Saturday",
        body = "Hello Emma will you attend David's Dad's Burial this Saturday?",
        timeStamp = "10:00"
    ),
    MailData(
        mailId = 5,
        userName = "Queen",
        subject = "Weekly Android News",
        body = "Hello Queen we have got exciting addition to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 6,
        userName = "Blessed",
        subject = "Weekly IOS News",
        body = "Hello Daniel we have got exciting addition to the IOS api",
        timeStamp = "13:10"
    ),
    MailData(
        mailId = 7,
        userName = "Oliver",
        subject = "Weekly Window News",
        body = "Hello Christy we have got exciting addition to the Windows api",
        timeStamp = "16:14"
    ),
    MailData(
        mailId = 8,
        userName = "Queen",
        subject = "Weekly Android News",
        body = "Hello Queen we have got exciting addition to the android api",
        timeStamp = "20:10"
    ),
    MailData(
        mailId = 9,
        userName = "David",
        subject = "Weekly IOS News",
        body = "Hello Daniel we have got exciting addition to the IOS api",
        timeStamp = "11:10"
    ),
    MailData(
        mailId = 10,
        userName = "Steven",
        subject = "Weekly Window News",
        body = "Hello Christy we have got exciting addition to the Windows api",
        timeStamp = "17:14"
    )
)


val accountList = listOf<Accounts>(
    Accounts(icon = R.drawable.huskydog, userName = "Chris", email="chris202@gmail.com", unReadMails=70),
    Accounts(userName = "Daniel", email="dan2022@gmail.com", unReadMails=30),
    Accounts(userName = "Tonye", email="tonye_direct@gmail.com", unReadMails=10)
)