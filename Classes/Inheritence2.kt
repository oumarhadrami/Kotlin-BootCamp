open class Book(var title: String, var author: String){

    private var currentPage: Int = 0
    open fun readPage() = println("${currentPage.inc()}")
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author){

    var numberOfWords: Int = 0
    override fun readPage() = println("${numberOfWords + 250}")

}

fun main(args: Array<String>) {
    val book1 = Book(title = "FU money", author = "Dan Lok") 
    val ebook1 = eBook(title = "FU money", author = "Dan Lok")

    book1.readPage()
    ebook1.readPage()
}