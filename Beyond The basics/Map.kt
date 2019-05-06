fun main(args: Array<String>) {
    
    val anime: Map<String,String> = mapOf("title" to "konosuba", "genre" to "fantasy")
    println(anime) 
    println(anime.get("genre"))
    println(anime["title"])
    println(anime.getOrDefault("auhtor","yukko"))

    val book = mutableMapOf("title" to "Rich Dad Poor Dad")
    println(book)
    book.put("author", "Robert Kiyosaki")
    println(book)
    book.remove("title")
    println(book)
}   