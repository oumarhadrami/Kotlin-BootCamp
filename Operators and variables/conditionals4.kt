fun main(args: Array<String>) {
    var s: String = "Hi Hadramy, keep up !"
    when(s.length){
        0-> println("You didn't type a thing i.e string s is empty")
        in 1..50-> println("Yes Keep it up.")
        in 51..100-> println("The string is quite long")
        else-> println("The length is clearly more than 100")
    }
}