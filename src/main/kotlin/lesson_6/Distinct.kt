/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(12, 2, 4, 43, 4, 54, 45, 65)))
}

private fun solution(A: IntArray): Int {
    return A.toSet().size
}