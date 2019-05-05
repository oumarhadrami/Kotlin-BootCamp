fun main(args: Array<String>) {
    val nullTest: Int? = null 
    println(nullTest?.plus(1) ?: 0)
    println(nullTest?.inc() ?: 0)
}