import java.util.*
fun main(args: Array<String>) {
    val a = intArrayOf(1,2,3)
    val b = arrayOf("Tuna", 7)
    println(Arrays.toString(a))
    println(Arrays.toString(b))


    println("Example of nested array")
    val c = 4
    val d = 9
    val e = arrayOf("Tuna",1,c,d,Arrays.toString(intArrayOf(4,8)),Arrays.toString(a))
    println(Arrays.toString(e))
}