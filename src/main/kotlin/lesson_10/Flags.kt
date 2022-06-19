package lesson_10

import kotlin.math.sqrt

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)))
}

private fun solution(A: IntArray): Int {
    val list = mutableListOf<Int>()
    for (i in 1 until A.size -1) {
        if (A[i - 1] < A[i] && A[i] > A[i + 1]) list.add(i)
    }
    if (list.size <= 1) return list.size

    val maxFlags = sqrt(list.last().toDouble() - list.first()).toInt()

    for (i in maxFlags+1 downTo 1) {
        var count = 1
        var prev = list[0]
        for (j in 1 until list.size) {
            if (list[j] - prev >= i) {
                count++
                prev = list[j]
            }
        }
        if (count >= i) return i
    }
    return 0
}