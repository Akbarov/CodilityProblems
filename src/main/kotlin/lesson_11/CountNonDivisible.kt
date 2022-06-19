
/**
Creator: Zohidjon Akbarov
 */
fun main() {

}

private fun solution(A: IntArray): IntArray {
    val map = mutableMapOf<Int, Int>()
    val list = mutableListOf<Int>()
    for (i in A.indices) {
        val prev = map[A[i]]
        if (prev != null) {
            list.add(prev)

        } else {
            var count = 0
            for (j in A.indices) {
                if (i != j && A[i] % A[j] != 0) {
                    count++
                }
            }
            map[A[i]] = count
            list.add(count)
        }
    }
    return list.toIntArray()
}