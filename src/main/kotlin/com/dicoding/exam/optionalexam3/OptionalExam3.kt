package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val numberInString = str.filter { it.isDigit() }.toIntOrNull() ?: 0
    val multipliedValue = numberInString * int

    return if (numberInString > 0) {
        str.replace(numberInString.toString(), "") + multipliedValue
    } else {
        str + int
    }
}
