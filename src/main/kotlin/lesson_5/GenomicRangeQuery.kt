package lesson_5

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution2("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)).joinToString())
}

private fun solution2(S: String, P: IntArray, Q: IntArray): IntArray {
    val map = Array(4) { IntArray(S.length + 1) }
    for ((i, c) in S.withIndex()) {
        val array = IntArray(4)
        when (c) {
            'A' -> array[0] = 1
            'C' -> array[1] = 1
            'G' -> array[2] = 1
            else -> array[3] = 1
        }
        for (index in array.indices) {
            map[index][i + 1] = array[index] + map[index][i]
        }
    }
    val result = IntArray(P.size)
    for (i in P.indices) {
        result[i] = getArrayMin(map, P[i], Q[i])
    }
    return result
}

private fun getArrayMin(map: Array<IntArray>, start: Int, end: Int): Int {
    for (i in map.indices) {
        if (map[i][end +1] > map[i][start]) {
            return i + 1
        }
    }
    return 4
}

private fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
    val nums = S.map {
        when (it) {
            'A' -> 1
            'C' -> 2
            'G' -> 3
            else -> 4
        }
    }.toTypedArray()
    val result = IntArray(P.size)
    for (i in P.indices) {
        result[i] = getMin(nums, P[i], Q[i])
    }
    return result
}

private fun getMin(a: Array<Int>, start: Int, end: Int): Int {
    var minValue = a[start]
    for (v in start..end) {
        if (a[v] < minValue) {
            minValue = a[v]
        }
    }
    return minValue
}