package lesson_6

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(1, 2, 3, 4, 5, 6, 6, 6)))
}

private fun solution(A: IntArray): Int {
    if (A.size < 3) return 0
    A.sort()
    for (i in A.size - 3 downTo 0) {
        if (A[i] < 0) return 0
        if (0L + A[i] + A[i + 1] > A[i + 2]) return 1
    }
    return 0
}