package lesson_10

import kotlin.math.sqrt

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(24))
}

private fun solution(N: Int): Int {
    val sqrt = sqrt(N.toDouble()).toInt()
    var count = 0
    for (i in 1 until sqrt) {
        if (N % i == 0) count++
    }
    return if (sqrt * sqrt == N) count + 1 else count
}