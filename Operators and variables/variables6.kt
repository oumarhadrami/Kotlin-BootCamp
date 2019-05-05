fun main(args: Array<String>) {
    var a: Int? = null
    println(a)
    var c = a ?: 4
    println(c)

    var l: List<String?>? = listOf("1","4")
    println(l?.size)

    var k: List<String?>? = null
    println(k?.size)
}