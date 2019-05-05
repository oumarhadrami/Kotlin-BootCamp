import java.util.*
fun main(args: Array<String>) {
    val L: MutableList<Int?>? = mutableListOf()
    for(i in 0..100){
        if(i%7==0) L?.add(i)
    }
    println(L)

    println("Another way of doing this is:")
    val M: MutableList<Int> = mutableListOf()
    for(j in 0..100 step 7) M.add(j)
    println(M)
}