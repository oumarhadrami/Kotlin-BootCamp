class Anime(var name: String = "anime", var episodeLength: Int = 24, var genre: String = "genre") {
 var rating: Double = 1.0
 
 constructor(ratingg: Double) : this(){
      rating = ratingg
 }

}

fun main(args: Array<String>) {
    val anime1 = Anime(name = "Konosuba", genre= "Isekai")
    val anime2 = Anime(name = "Isekai Quartet", episodeLength = 10 ,genre= "Fantsay")
    var anime3 = Anime(ratingg = 4.9)

    println("Name: ${anime1.name}, Episode Lenght: ${anime1.episodeLength}, Genre: ${anime1.genre}")
    println("Name: ${anime2.name}, Episode Lenght: ${anime2.episodeLength}, Genre: ${anime2.genre}")
    println("Name: ${anime3.name}, Episode Lenght: ${anime3.episodeLength}, Genre: ${anime3.genre}, Rating: ${anime3.rating}")

}
