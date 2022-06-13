package lesson_4

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))
}

private fun solution(X: Int, A: IntArray): Int {
    val array = BooleanArray(X + 1)
    var steps = X
    if (X == 0 && A[0] == 1) return 0
    for ((index, item) in A.withIndex()) {
        if (!array[item]) {
            array[item] = true
            steps--
            if (steps == 0) {
                return index
            }
        }
    }
    return -1
}