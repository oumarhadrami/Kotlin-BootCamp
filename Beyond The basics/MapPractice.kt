fun main(args: Array<String>) {
    
    val allBooks = setOf("Mentality Changing", "Smart Decisions", "Walk in the Park")
    val library = mapOf("William Shakespeare" to allBooks)
    println(library.any{it.value.contains("Hamlet")})

   val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

}