import java.util.*
fun main(args: Array<String>) {
    gamePlay(rollDice(4))
}

 var rollDice = {numberOfSides: Int -> if (numberOfSides == 0) 0 else Random().nextInt(12)+1}

 fun gamePlay(diceroll: Int) = println(diceroll)