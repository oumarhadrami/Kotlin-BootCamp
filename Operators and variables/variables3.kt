fun main(args: Array<String>) {
    println("To assign a variable of one datatype to a variable of diffeent datatype, we can cast it as follows:")
    val e: Byte = 4
    val f: Int = e.toInt()
    println(e)
    println(f)
}