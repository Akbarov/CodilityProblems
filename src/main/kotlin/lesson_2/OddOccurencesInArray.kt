package lesson_2

/**
Creator: Zohidjon Akbarov
 */
fun main() {
println(solution(intArrayOf(9,8,9,4,2,4,2)))
}

private fun solution(A: IntArray): Int {
    if (A.isEmpty()) return 0
    var result = A[0]
    for (i in 1 until A.size) {
        result = result xor A[i]
    }
    return result
}