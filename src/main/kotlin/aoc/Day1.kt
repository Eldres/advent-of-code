package aoc

import java.io.File

fun main() {
    val input = File(ClassLoader.getSystemResource("202001").file).readText()
    val datesList = input.split("\n")
        .map { it.trim() }
        .map { it.toInt() }
        .toMutableList()

    println(datesList)

    val part1 = datesList.mapNotNull { date1 ->
        datesList.firstOrNull { date2 ->
            (date1 + date2) == 2020
        }
    }.reduce { date1, date2 -> date1 * date2 }
    println(part1)

    val part2 = datesList.asSequence().map { date1 ->
        datesList.mapNotNull { date2 ->
            datesList.firstOrNull { date3 ->
                date1 + date2 + date3 == 2020
            }
        }
    }.filterNot { it.isEmpty() }.flatten().distinct().reduce { date1, date2 -> date1 * date2}
    println(part2)
}