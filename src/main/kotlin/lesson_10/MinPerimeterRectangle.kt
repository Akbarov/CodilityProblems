package lesson_10

import kotlin.math.sqrt

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(30))
}
private fun solution(N: Int): Int {
    var sqrt = sqrt(N.toDouble()).toInt()
    while (N%sqrt!=0)sqrt--
    return 2*(sqrt+N/sqrt)
}