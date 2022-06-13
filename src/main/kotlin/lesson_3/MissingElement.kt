package lesson_3

/**
Creator: Zohidjon Akbarov
 */
fun main() {
    println(solution(intArrayOf(1,2,3)))
}
private fun solution(A: IntArray): Int {
    val bools = BooleanArray(A.size+1)
    for(item in A){
        bools[item-1]=true
    }
    var counter =0
    for(isTrue in bools){
        counter++
        if(!isTrue){
            return counter
        }
    }
    return bools.size
}