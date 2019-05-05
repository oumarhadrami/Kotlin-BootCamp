fun main(args: Array<String>) {
    val m1 = Movies("Titans")
    println(m1)

    val m2 = Movies("Iron man")
    println(m2)

    val m3 = Movies("Batman")
    println(m3)

    val m4 = m2.copy()
    println(m2)
    println(m4)

    println(m1.equals(m3))
    println(m2.equals(m3))

    val a1 = Anime("Kaiji")
    println(a1)

    val b1 = Books(author = "Dan Lok", age = 37)
    val (author,age) = b1
    println(author)
    println(age)
}

class Anime(var genre: String = "Konosuba"){}

data class Movies(val title: String = "Avengers"){}

data class Books(val author: String = "Robert Kiyosaki", val age: Int = 73)