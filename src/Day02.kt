import java.io.File
import java.io.InputStream

fun main() {
    fun part1(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0
        val instructions = input.map { it.split(' ') }
        for ((direction, amountString) in instructions) {
            val amount = amountString.toInt()
            when (direction) {
                "forward" -> horizontalPosition += amount
                "up" -> depth -= amount
                "down" -> depth += amount
            }
        }
        return horizontalPosition * depth
    }

    fun part2(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0
        var aim = 0
        val instructions = input.map { it.split(' ') }
        for ((direction, amountString) in instructions) {
            val amount = amountString.toInt()
            when (direction) {
                "forward" -> {
                    horizontalPosition += amount
                    depth += (aim * amount)
                }
                "up" -> aim -= amount
                "down" -> aim += amount
            }
        }
        return horizontalPosition * depth

    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
