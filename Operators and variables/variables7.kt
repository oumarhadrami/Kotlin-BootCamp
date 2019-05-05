fun main(args: Array<String>) {
    val L = mutableListOf("tuna","salmon","shark")
    println("We cannot assign the value of L to something else anymore but we can use functions of list object")
    L.remove("salmon")
    println(L)
}