package lesson_4

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(A: IntArray): Int {
    val list = BooleanArray(A.size)
    for (item in A) {
        if (item>list.size) return 0
        list[item-1] = true
    }
    for (has in list) {
        if (!has) return 0
    }
    return 1
}