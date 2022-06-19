package lesson_8

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(A: IntArray): Int {
    if (A.isEmpty()) return 0
    if (A.size == 1) return 0
    val temp = A.sorted()
    var number = temp[0]
    var count = 1
    for (i in 1 until temp.size) {
        if (number == temp[i]) {
            count++
            if (count > temp.size / 2) break
        } else {
            count = 1
            number = temp[i]
        }
    }
    if (count > temp.size / 2)
        for (i in A.indices) {
            if (A[i] == number) return i
        }
    return -1

}