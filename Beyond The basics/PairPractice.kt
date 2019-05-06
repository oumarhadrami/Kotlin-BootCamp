fun main(args: Array<String>) {
    val book1 = Book(title = "Rich Dad Poor Dad", author = "Robert Kiyosaki", year = 1997)
    println("The book ${book1.titleAndAuthor().first} was written by ${book1.titleAndAuthor().second}")
    println("The book ${book1.titleAndAuthorAndYear().first} was written by ${book1.titleAndAuthorAndYear().second} in ${book1.titleAndAuthorAndYear().third}")

}

class Book(var title: String = "title", var author: String = "author", var year: Int = 1970){

    fun titleAndAuthor() : Pair<String,String> {
        return Pair(title, author)
    }

    fun titleAndAuthorAndYear() : Triple<String,String,Int> {
        return Triple(title,author,year)
    }

}