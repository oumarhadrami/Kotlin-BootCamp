class Spice(var name: String, var spiciness: String = "mild"){

    val heat: Int get() { return when{
        spiciness == "mild" -> 0
        else-> 1
    } 
    }

    val spices = listOf(Spice(name = "curry", spiciness = "mild"), Spice(name = "Paprika", spiciness = "Very spicy"))
    val spicelist = spices.filter{it.heat > 0}

    init{
        for(element in spices){
        println("Name: ${element.name}, Spiciness = ${element.spiciness}")
        }
    }
}

fun main(args: Array<String>) {
    val spice1 = Spice(name = "cyenne", spiciness = "not spicy")
    
}