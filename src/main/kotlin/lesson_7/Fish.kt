package lesson_7

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0)))
}

private fun solution(A: IntArray, B: IntArray): Int {
    val stack = Stack<Int>()
    var count = A.size

    for (i in A.indices) {
        if (B[i] == 1) {
            stack.push(A[i])
        } else {
            while (stack.isNotEmpty()) {
                count--
                if (stack.peek() > A[i]) {
                    break
                } else {
                    stack.pop()
                }
            }
        }
    }
    return count
}