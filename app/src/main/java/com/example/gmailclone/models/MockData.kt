package com.example.gmailclone.models

data class MockMailData(
    val mailId: Int,
    val sender: String,
    val subject: String,
    val body: String,
    val timestamp: String
)

val firstMail = MockMailData(
    1,
    "Darul-ifta-Ahlesunnat",
    "Principles of Wudhu",
    "This is regarding the...",
    "12:00"
)

val secondMail = MockMailData(
    2,
    "Slice",
    "Pay your debt.",
    "Your balance is overdue.Pay immediately...",
    "11:00"
)

val thirdMail = MockMailData(
    3,
    "Junaid",
    "Pay your debt.",
    "Your balance is overdue.Pay immediately...",
    "07:00"
)

val fourthMail = MockMailData(
    4,
    "LemonVb",
    "Pay your debt.",
    "Your balance is overdue.Pay immediately...",
    "12:54"
)

val fithMail = MockMailData(
    5,
    "Google",
    "Secure your account.",
    "Your balance is overdue.Pay immediately...",
    "12:00"
)


val sixthMail = MockMailData(
    6,
    "Darul-ifta-Ahlesunnat",
    "Principles of Wudhu",
    "This is regarding the...",
    "12:00"
)

val seventhMail = MockMailData(
    7,
    "Slice",
    "Pay your debt.",
    "Your balance is overdue.Pay immediately...",
    "11:00"
)

val eigthMail = MockMailData(
    8,
    "Junaid",
    "Pay your debt.",
    "Your balance is overdue.Pay immediately...",
    "07:00"
)

val ninthMail = MockMailData(
    9,
    "LemonVb",
    "Pay your debt.",
    "Your balance is overdue.Pay immediately...",
    "12:54"
)

val tenthMail = MockMailData(
    10,
    "Google",
    "Secure your account.",
    "Your balance is overdue.Pay immediately...",
    "12:00"
)


val list = listOf(firstMail, secondMail, thirdMail, fourthMail, fithMail, sixthMail,
    seventhMail, eigthMail, ninthMail, tenthMail)