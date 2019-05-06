fun main(args: Array<String>) {
    println("movie is a form of entertainment".hasTheWordAnime())
}

fun String.hasTheWordAnime(): Boolean{
    return this.contains("anime") //will return false
}