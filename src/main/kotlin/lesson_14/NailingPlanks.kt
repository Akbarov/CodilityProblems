package lesson_14

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(A: IntArray, B: IntArray, C: IntArray): Int {
    var count = 0
    for (i in A.indices) {
        var isFound = false
        for (item in C) {
            if (item >= A[i] && item <= B[i]) {
                count++
                isFound = true
                break
            }
        }
        if (!isFound) {
            return -1
        }
    }
    return count
}