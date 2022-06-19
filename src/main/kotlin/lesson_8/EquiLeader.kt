package lesson_8

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(4, 3,4, 4, 4, 2)))
}

private fun solution(A: IntArray): Int {
    if (A.isEmpty()) return 0
    val map = mutableMapOf<Int, Int>()
    for (item in A) {
        map[item] = (map[item] ?: 0) + 1
    }
    var leader = 0
    var maxCount = 0
    for ((item, count) in map) {
        if (count > maxCount) {
            maxCount = count
            leader = item
        }
    }
    var leftLeaderCount = 0
    var equiLeaderCount = 0
    if (maxCount * 2 <= A.size) return 0
    for ((i, item) in A.withIndex()) {
        if (item == leader) leftLeaderCount++
        if (leftLeaderCount * 2 > i + 1) {
            val rightLeaderCount = maxCount - leftLeaderCount
            if (rightLeaderCount * 2 > (A.size - i - 1)) {
                equiLeaderCount++
            }
        }
    }
    return equiLeaderCount
}












