package aoc

import java.io.File

/*
--- Day 2: Password Philosophy ---
Your flight departs in a few days from the coastal airport; the easiest way down to the coast from here is via toboggan.

The shopkeeper at the North Pole Toboggan Rental Shop is having a bad day. "Something's wrong with our computers; we can't log in!" You ask if you can take a look.

Their password database seems to be a little corrupted: some of the passwords wouldn't have been allowed by the Official Toboggan Corporate Policy that was in effect when they were chosen.

To try to debug the problem, they have created a list (your puzzle input) of passwords (according to the corrupted database) and the corporate policy when that password was set.

For example, suppose you have the following list:

1-3 a: abcde
1-3 b: cdefg
2-9 c: ccccccccc
Each line gives the password policy and then the password. The password policy indicates the lowest and highest number of times a given letter must appear for the password to be valid. For example, 1-3 a means that the password must contain a at least 1 time and at most 3 times.

In the above example, 2 passwords are valid. The middle password, cdefg, is not; it contains no instances of b, but needs at least 1. The first and third passwords are valid: they contain one a or nine c, both within the limits of their respective policies.

How many passwords are valid according to their policies?
 */

fun main() {
    val input = File(ClassLoader.getSystemResource("202002").file).readText()

//    val numOccurance = input.split(" ").first()
//    val letter = input.split(":").first().split(" ").last()
//    val password = input.split(" ").last()
//    val minOccurance = numOccurance.split("-").first().toInt()
//    val maxOccurance = numOccurance.split("-").last().toInt()
//
//    println(letter)
//    println(password)
//    println(minOccurance)
//    println(maxOccurance)

    val inputCorpPolicy = input.split(" ")
        .map {
            it.filterNot {
                it.isLetter() || it.equals(':')
            }
        }.filterNot { it.isBlank() }
        .map { it.trim() }

    val inputPassword = input.split(" ")
        .map {
            it.filter {
                it.isLetter()
        }.trim()
    }.filter { it.length > 1 }

    val inputValidPasswordChar = input.split(" ")
        .map {
            it.filter {
                it.isLetter()
        }.trim()
    }.filter { it.length.equals(1) }

    println("======inputCorpPolicy==============")
    println(inputCorpPolicy)
    println("======inputPassword================")
    println(inputPassword)
    println("=====inputValidPasswordChar========")
    println(inputValidPasswordChar)
}