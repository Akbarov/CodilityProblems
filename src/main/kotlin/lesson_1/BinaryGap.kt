package lesson_1

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(9))
    println(solution(529))
}

private fun solution(N: Int): Int {
    val str = N.toString(2)
    var count = 0
    if (str.count { it == '1' } == 1 || str.count { it == '0' } == 0) return 0
    var m = 0
    for (item in str) {
        if (item == '1') {
            if (count < m) count = m
            m = 0
        } else {
            m++
        }
    }
    return count
}