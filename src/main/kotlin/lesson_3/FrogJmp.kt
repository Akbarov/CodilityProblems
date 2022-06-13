package lesson_3

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(10,85,30))
}

private fun solution(X: Int, Y: Int, D: Int): Int {
    return if ((Y - X) % D == 0) (Y - X) / D else (Y - X) / D + 1
}