package lesson_7

import java.util.*

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution("()()()(){}"))
}

private fun solution(S: String): Int {
    val stack = Stack<Char>()
    for (c in S) {
        when (c) {
            '(', '[', '{' -> stack.push(c)
            ')' -> {
                if (stack.isNotEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    return 0
                }
            }
            ']' -> {
                if (stack.isNotEmpty() && stack.peek() == '[') {
                    stack.pop()
                } else {
                    return 0
                }
            }
            '}' -> {
                if (stack.isNotEmpty() && stack.peek() == '{') {
                    stack.pop()
                } else {
                    return 0
                }
            }
        }
    }
    return if (stack.isEmpty()) 1 else 0
}