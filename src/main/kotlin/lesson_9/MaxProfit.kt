package lesson_9

/**
Creator: Zohidjon Akbarov
 */
fun main() {
println(solution2(intArrayOf(12,3,4,5,354,3)))
}

//O(n^2)
private fun solution(A: IntArray): Int {
    var prof = 0
    for (i in A.size - 1 downTo 1) {
        for (j in i - 1 downTo 0) {
            if (A[i] - A[j] > prof) prof = A[i] - A[j]
        }
    }
    return prof
}


//O(n)
private fun solution2(A: IntArray): Int {
    if (A.size < 2) return 0
    var minValue = A[0]
    var maxProf = 0
    for (item in A) {
        if (item < minValue) {
            minValue = item
        } else {
            if (maxProf < item - minValue) {
                maxProf = item - minValue
            }
        }
    }
    return maxProf
}
