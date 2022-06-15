package lesson_4

import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)).joinToString())
}

private fun solution(N: Int, A: IntArray): IntArray {
    val result = IntArray(N)
    var maxC = 0
    var increase = 0
    for (item in A) {
        if (item <= N) {
            result[item - 1]++
            maxC = max(result[item - 1], maxC)
        } else {
            for (i in result.indices) {
                result[i] = maxC
            }
        }
    }
    return result
}