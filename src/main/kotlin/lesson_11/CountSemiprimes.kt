import kotlin.math.sqrt

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(26, intArrayOf(1, 4, 16), intArrayOf(26, 10, 20)).joinToString())
}

private fun solution(N: Int, P: IntArray, Q: IntArray): IntArray {
    val result = IntArray(P.size)
    val semiPrimes = getSemiPrimes(N)
    for (i in P.indices) {
        result[i] = semiPrimesBetween(P[i], Q[i], semiPrimes)
    }
    return result
}

private fun semiPrimesBetween(a: Int, b: Int, semiPrimes: List<Int>): Int {
    var count = 0
    for (item in semiPrimes) {
        if (a <= item) {
            if (b >= item) count++
            else break
        }
    }
    return count
}

private fun getSemiPrimes(n: Int): List<Int> {
    val result = mutableListOf<Int>()
    val primes = getPrimeNumbers(n)
    val primeSet = primes.toHashSet()
    for (item in 4..n) {
        for (p in primes) {
            if (p * p > item) break
            if (item % p == 0 && primeSet.contains(item / p)) {
                result.add(item)
            }
        }
    }
    return result
}

private fun getPrimeNumbers(n: Int): List<Int> {
    val primes = mutableListOf<Int>()
    primes.add(2)
    primes.add(3)
    primes.add(5)
    for (number in 6..n) {
        val sqrt = sqrt(number.toDouble()).toInt()
        var isPrime = true
        for (item in primes) {
            if (item > sqrt) break
            if (number % item == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes.add(number)
        }
    }
    return primes
}