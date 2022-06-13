package lesson_3

import kotlin.math.abs

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(3, 2, 1, 4, 3)))
}

private fun solution(A: IntArray): Int {
    val total = A.sum()
    var sum = 0
    var minDif = Int.MAX_VALUE
    for (i in 0 until A.lastIndex) {
        sum += A[i]
        if (abs(total - 2 * sum) < minDif) {
            minDif = abs(total - 2 * sum)
        }
    }
    return minDif
}