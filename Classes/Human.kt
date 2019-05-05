class Human(var age: Int){

    constructor(height: Int, weight: Int) : this(age = 14){
        println("Secondary: height = $height, weight = $weight")
    }

    init{
        println("Primary1")
        if(age>13)
        println("Name: Hadramy")
        else
        println("Name: Oumar")
    }

    init{
        println("Primary2")
    }
}

fun main(args: Array<String>) {
    Human(age = 24)
    Human(height = 184, weight = 84)
    createHuman()
}

 fun createHuman() = Human(age = 12)