package lesson_12

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution2(10, 4))
}

private fun solution(N: Int, M: Int): Int {
    val set = mutableSetOf<Int>()
    var count = 1
    set.add(0)
    while (set.add((count * M) % N)) count++
    return count
}

private fun solution2(N: Int, M: Int): Int {
    return N / gcd(N, M)
}

private fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) return b
    return gcd(b, a % b)
}