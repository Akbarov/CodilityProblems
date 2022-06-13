package lesson_2

/**
Creator: Zohidjon Akbarov
 */
fun main() {
println(solution(intArrayOf(1,2,3,4),2).joinToString())
}

private fun solution(A: IntArray, K: Int): IntArray {
    val size = A.size
    val result = IntArray(size)
    val circle = K % size
    for (i in A.indices) {
        result[(i+circle)%size] = A[i]
    }
    return result
}