package lesson_6

import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(2, 3, 5, 5, 6 - 3, 1, -10)))
}

private fun solution(A: IntArray): Int {
    if (A.size < 3) return 0
    A.sort()
    val size = A.size
    val first = A[size - 1] * A[size - 2] * A[size - 3]
    val second = A[size - 1] * A[0] * A[1]
    return max(first, second)
}