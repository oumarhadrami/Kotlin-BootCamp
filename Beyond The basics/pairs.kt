fun main(args: Array<String>) {
    
    val city = "Mauritania" to "Nouakchott"
    println("$city")
    println("${city.first} -> ${city.second}")

    val anime = "Konosuba" to "Kazuma" to "fantasy" to "isekai"
    println(anime)
    println("${anime.first.first}")

    val movie = ("title" to "IronMan") to ("title" to "Batman")
    println(movie)

    val (ironman, batman) = movie
    println(ironman.toString())
    println(batman.toList())

    val ebook = Pair("title", "auhtor")
    println(ebook)

    val book = Triple("title", "author", "genre")
    println(book)
}