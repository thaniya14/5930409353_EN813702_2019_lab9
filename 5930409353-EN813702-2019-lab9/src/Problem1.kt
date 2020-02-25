package boonbutra.thaniya.lab9

class Spice (val name:String,val spiciness: String="mild"){
    val heat : Int
    get(){
        return when(spiciness){
            "mild" ->1
            "medium" -> 3
            "spicy" ->5
            "very spicy" ->7
            else -> 10
        }
    }
    init {
        println("spice ${this.name} has")
    }
}

fun main(args: Array<String>){
    var spices:List<Spice> =  listOf(Spice("green curry"),
        Spice("red curry","medium"),
        Spice("pepper","spicy"),
        Spice("red pepper","very spicy")
    )

    fun getSpicyOrless(spicies: List<Spice>) : List<Spice>{
        val s:List<Spice> = spicies.filter { it.heat <=5 }
        return s
    }


    val spicies2:List<Spice> = getSpicyOrless(spices)
    println("=== printing only spicy or less than spicy ===")
    for(s2:Spice in spicies2){
        println("${s2.name} has spicy level as ${s2.spiciness}")
    }
    println("=== Make Salt ===")
    fun makeSalt() = Spice("salt")


}