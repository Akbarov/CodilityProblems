package lesson_14

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(3, 5, intArrayOf(2, 1, 5, 1, 2, 2, 2)))
}

private fun solution(K: Int, M: Int, A: IntArray): Int {

    var lower = A.maxOrNull() ?: 0
    if (lower < 0) lower = 0
    var upper = A.sum()
    while (lower <= upper) {
        val targetSum = (lower + upper) / 2
        if (dividable(targetSum, K, A)) {
            upper = targetSum - 1
        } else {
            lower = targetSum + 1
        }
    }
    return lower
}

private fun dividable(sumMax: Int, k: Int, array: IntArray): Boolean {
    var count = 1
    var tempSum = 0
    for (item in array) {
        tempSum += item
        if (tempSum > sumMax) {
            tempSum = item
            count++
            if (count > k) return false
        }
    }
    return count <= k
}

