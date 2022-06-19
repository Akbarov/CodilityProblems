package lesson_9

import kotlin.math.max

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution2(intArrayOf(3, 2, 6, -1, 4, 5, -1, 2)))
}

//O(n^4)
private fun solution(A: IntArray): Int {
    var result = 0

    for (i in 0..A.size - 3) {
        for (j in i + 1..A.size - 2) {
            for (k in j + 1 until A.size) {
                var sum = 0
                for (t in i + 1 until k) {
                    if (t != j) {
                        sum += A[t]
                        if (sum > result) result = sum
                    }
                }
            }
        }
    }
    return result
}

private fun solution2(A: IntArray): Int {
    var result = 0
    val leftMax = IntArray(A.size)
    val rightMax = IntArray(A.size)
    for (i in 1 until A.size) {
        leftMax[i] = max(0, leftMax[i - 1] + A[i])
    }
    for (i in A.size - 2 downTo 0) {
        rightMax[i] = max(0, rightMax[i + 1] + A[i])
    }
    for (i in 1 until A.size - 1) {
        if (leftMax[i - 1] + rightMax[i + 1] > result) {
            result = leftMax[i - 1] + rightMax[i + 1]
        }
    }
    return result
}