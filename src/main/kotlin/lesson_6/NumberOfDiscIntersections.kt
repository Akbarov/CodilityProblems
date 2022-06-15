package lesson_6

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(1, 5, 2, 1, 4, 0)))
}

private fun solution(A: IntArray): Int {
    val openings = LongArray(A.size)
    val closings = LongArray(A.size)
    for ((index, item) in A.withIndex()) {
        openings[index] = 0L + index - item
        closings[index] = 0L + index + item
    }
    openings.sort()
    closings.sort()
    var left = 0
    var right = 0
    var count = 0
    var open = 0
    while (open >= 0 && left < A.size && right < A.size) {
        if (openings[left] <= closings[right]) {
            count += open
            open++
            left++
        } else {
            open--
            right++
        }
        if (count > 10_000_000) return -1
    }
    return count

}