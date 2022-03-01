package com.example.spanishvocab

import java.io.Serializable

class Word(
    var spanishWord    : String = "",
    var englishWord    : String = ""
) : Serializable {

    override fun toString(): String {
        return "Words(spanishword=${spanishWord}, " +
                "englishword=${englishWord}"
    }
}