import java.util.*
fun main(args: Array<String>) {
    val numbers = intArrayOf(11,12,13,14,15)
    println(Arrays.toString(numbers))
    val l: MutableList<String?>? = mutableListOf()
    for((i,element) in numbers.withIndex()){
        l?.add(numbers[i].toString())
    }
    println(l)
}