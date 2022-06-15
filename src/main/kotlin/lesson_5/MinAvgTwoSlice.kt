package lesson_5

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution2(intArrayOf(4, 2, 2, 5, 2, 5, 8)))
}

// O(n^2)
private fun solution(A: IntArray): Int {
    val first = A[A.size-1]*A[A.size-2]*A[A.size-3]
    val sumArray = DoubleArray(A.size + 1)
    sumArray[0] = 0.toDouble()
    for (i in A.indices) {
        sumArray[i + 1] = sumArray[i] + A[i]
    }
    var minValue = Double.MAX_VALUE
    var startIndex = 0
    for (i in sumArray.indices) {
        for (j in i + 2 until sumArray.size) {
            if ((sumArray[j] - sumArray[i]) / (j - i) < minValue) {
                minValue = (sumArray[j] - sumArray[i]) / (j - i)
                startIndex = i
            }
        }
    }
    return startIndex
}

private fun solution2(A: IntArray): Int {
    var twoMinSum = A[0] + A[1]
    var threeMinSum = Int.MAX_VALUE

    var index2 = 0
    var index3 = 0
    for (i in 2 until A.size) {
        var temp = A[i] + A[i - 1]
        if (temp < twoMinSum) {
            twoMinSum = temp
            index2 = i - 1
        }
        temp += A[i - 2]
        if (temp < threeMinSum) {
            threeMinSum = temp
            index3 = i - 2
        }
    }
    return if (twoMinSum * 3 == threeMinSum * 2) {
        if (index2 < index3) index2 else index3
    } else {
        if (twoMinSum * 3 < threeMinSum * 2) index2 else index3
    }
}