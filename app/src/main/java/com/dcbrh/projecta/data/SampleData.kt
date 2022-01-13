package com.dcbrh.projecta.data

import com.dcbrh.projecta.R
import com.dcbrh.projecta.model.Message

object SampleData {
    val sampleConvo = listOf<Message>(
        Message(
            "Teacher",
            "Test...Test...Test...",
            R.mipmap.meme
        ),Message(
            "Tom",
            "List of Android versions:\n" +
                    "Android KitKat (API 19)\n" +
                    "Android Lollipop (API 21)\n" +
                    "Android Marshmallow (API 23)\n" +
                    "Android Nougat (API 24)\n" +
                    "Android Oreo (API 26)\n" +
                    "Android Pie (API 28)\n" +
                    "Android 10 (API 29)\n" +
                    "Android 11 (API 30)\n" +
                    "Android 12 (API 31)\n",
            R.mipmap.meme
        ),Message(
            "Jerry meme",
            "I know what you're doing",
            R.mipmap.meme
        ),Message(
            "Colleague",
            "I think Kotlin is my favorite programming language.\n" +
                    "It's so much fun!",
            R.mipmap.meme
        ),Message(
            "Colleague",
            "Hey, take a look at Jetpack Compose, it's great!\n" +
                    "It's the Android's modern toolkit for building native UI." +
                    "It simplifies and accelerates UI development on Android." +
                    "Less code, powerful tools, and intuitive Kotlin APIs :)",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "It's available from API 21+ :)",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "Android Studio next version's name is Arctic Fox",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "I didn't know you can now run the emulator directly from Android Studio",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "Compose Previews are great to check quickly how a composable layout looks like",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "Previews are also interactive after enabling the experimental setting",
            R.mipmap.meme
        ), Message(
            "Colleague",
            "Have you tried writing build.gradle with KTS?",
            R.mipmap.meme
        )
    )
}