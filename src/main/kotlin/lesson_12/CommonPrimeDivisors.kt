package lesson_12

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(15, 10, 3), intArrayOf(75, 30, 5)))
}

private fun solution(A: IntArray, B: IntArray): Int {
    var count = 0
    for (i in A.indices) {
        if (hasTheSameFactors(A[i], B[i])) count++
    }
    return count
}

private fun hasTheSameFactors(a: Int, b: Int): Boolean {
    val gcd = gcd(a, b)
    var valueA = a
    var valueB = b
    var gcdA = gcd
    while (valueA != 1) {
        valueA /= gcdA
        gcdA = gcd(valueA, gcdA)
        if (gcdA == 1) break
    }
    if (valueA != 1) return false
    var gcdB = gcd
    while (valueB != 1) {
        valueB /= gcdB
        gcdB = gcd(valueB, gcdB)
        if (gcdB == 1) break
    }
    return valueB == 1
}

private fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) return b
    return gcd(b, a % b)
}