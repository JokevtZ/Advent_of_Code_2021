fun main() {
    fun lanternFish(input: List<String>, iterNum: Int): Long {
        val timers = ArrayDeque(List(9) { 0L })
        for (fish in input.first().split(","))
            timers[fish.toInt()]++

        repeat(iterNum) {
            timers.addLast(timers.removeFirst())
            timers[6] += timers[8]
            println(timers)
        }
        return timers.sum()
    }

    val input = readInput("Day06")
    println(lanternFish(input, 80))
    println(lanternFish(input, 256))
}
