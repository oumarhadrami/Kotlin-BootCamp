fun main(args: Array<String>) {
    println("we cannot assign a variable as val a = null, | we need to give it the possibility of being either null or non-null as follows:")
    var g: Int? = null 
    println(g)

    println("Another example is list can be null or its elements can be null")
    println("List can be null")
    var h: List<String>? = null
    println(h)
    println("list elements can be null")
    var i: List<String?> = listOf(null,null)
    println(i)
    println("both list and list elements can be null")
    var j: List<String?>? = listOf("1",null)
    println(j)
}