package toptal

import kotlin.math.ceil

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}
private  fun solution(X: Int, B: IntArray, Z: Int): Int {
    // write your code in Kotlin 1.3.11 (Linux)
    val total = B.sum()
    if (total >= X) return 0
    val remain = X - total
    var average = 0.0
    var count = 1
    if (Z <= 0) return -1
    while (count <= Z) {
        average += B[B.size - count]
        count++
    }
    average /= Z
    if (average <= 0) return -1
    return ceil(remain / average).toInt()
}