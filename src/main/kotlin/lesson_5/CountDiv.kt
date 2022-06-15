package lesson_5

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(6, 11, 2))
}

private fun solution(A: Int, B: Int, K: Int): Int {
    return B / K - A / K + if (A % K == 0) 1 else 0
}