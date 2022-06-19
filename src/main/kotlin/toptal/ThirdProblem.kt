package toptal

import java.text.DecimalFormat

/**
Creator: Zohidjon Akbarov
 */
fun main() {
println(solution("300.01", arrayOf("300.00","200.00","100.00")).joinToString())
println(solution("1.00", arrayOf("0.05","1.00")).joinToString())
}

private fun solution(S: String, B: Array<String>): Array<String> {
    // write your code in Kotlin 1.3.11 (Linux)
    var sDouble = S.toDouble()
    val array = B.map { it.toDouble() }
    var totalSum = array.sum()
    val ordered = mutableListOf<Pair<Double, Int>>()
    for ((i, d) in array.withIndex()) {
        ordered.add(Pair(d, i))
    }
    ordered.sortByDescending { it.first }
    val result = Array(B.size) { "" }
    val format = DecimalFormat("####0.00")
    for (pair in ordered) {
        var invoice = (sDouble * pair.first) / totalSum
        invoice*=100
        invoice = Math.round(invoice).toDouble()
        invoice/=100
        result[pair.second] = format.format(invoice)
        sDouble -= format.format(invoice).toDouble()
        totalSum-=pair.first
    }
    return result
}