package toptal

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(X: Int): String {
    // write your code in Kotlin 1.3.11 (Linux)
    val MIN = 60
    val HOUR = 60 * MIN
    val DAY = HOUR * 24
    val WEEK = DAY * 7
    if (X < MIN) return "${X}s"
    if (X < HOUR) {
        val min = X / 60
        val sec = X % 60
        if (sec > 0) {
            return "${min}m${sec}s"
        } else {
            return "${min}m"
        }
    }
    if (X < DAY) {
        val h = X / HOUR
        var min = (X - h * HOUR) / MIN
        val sec = X - h * HOUR - min * MIN
        if (sec > 0) {
            min += 1
        }
        return "${h}h${min}m"
    }
    if (X < WEEK) {
        val d = X / DAY
        var h = (X - d * DAY) / HOUR
        if (d * DAY + h * HOUR < X) {
            h += 1
        }

        return "${d}d${h}h"
    }
    if (X < WEEK) {
        val w = X / WEEK
        var d = (X - w * WEEK) / DAY
        if (w * WEEK + d * DAY < X) {
            d += 1
        }

        return "${w}w${d}d"
    }
    return ""
}
