package lesson_9

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(A: IntArray): Int {
    if (A.isEmpty()) return 0
    var sum = 0
    var result = A[0]
    var left = 0
    var right = 0
    while (right < A.size) {
        sum += A[right]
        if (result < sum) result = sum
        while (sum < 0 && left <= right) {
            sum -= A[left++]
        }
        right++
    }
    return result
}