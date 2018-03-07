interface DrivenBySomething{
    val name:String
    fun action():String
}

class Drink(name:String): DrivenBySomething{
    override val name = name
    override fun action() = "${name}が魔剤を飲む"
}

class Angry(override val name:String): DrivenBySomething{
    override fun action() = "${name}は怒った"
}

fun main(args:Array<String>){
    val drank = Drink("MazaiCrafty")
    val pptp = Angry("ピピ美")

    val things = mutableListOf<DrivenBySomething>()
    things.add(drank)
    things.add(pptp)
    things.add(object:DrivenBySomething{
        override val name = "PMMP"
        override fun action() = "${name}!?破壊したはずでは...。"
    })

    for (thing in things){
        println(thing.action())
    }
}

