package lesson_7

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(H: IntArray): Int {
    var count = 0
    val stack = Stack<Int>()
    for (item in H) {
        while (stack.isNotEmpty() && stack.peek() > item) stack.pop()
        if (stack.isEmpty() || stack.peek() < item) {
            count++
            stack.push(item)
        }
    }
    return count
}