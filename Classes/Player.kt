package Classes

class Player{

    var name: String = "Cristiano"
    var height: Int = 184
    var weight: Int = 85

    fun BMI() :Int{
        return (height/weight)*10
    }

    val BMR: Int 
        get() = (height/weight) * 90

    val stamina: Int
    get() {
    return height-weight
    }
}

fun main(args: Array<String>) {
    createPlayer()
}

fun createPlayer(){
    val player1 = Player()
    println("Name: ${player1.name}, \n Height: ${player1.height}, \n Weight: ${player1.weight}, \n BMI: ${player1.BMI()}, \n BMR: ${player1.BMR} , \n Stamina: ${player1.stamina}")
}