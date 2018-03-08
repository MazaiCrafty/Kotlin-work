enum class Series(val type:String){
    MONSTER("緑"), KHAOS("オレンジ"), ABSOLUTELY("青"), ULTRA("白"), DOCTOR("黄")
}

fun likeTaste(dir: Series): String{
    return when(dir){
        Series.MONSTER->"甘く爽やかな"
        Series.KHAOS->"不思議な"
        Series.ABSOLUTELY->"物足りないが軽い"
        Series.ULTRA->"凝った感じの"
        Series.DOCTOR->"甘すぎずとても良い"
        else->"普通な"
    }
}

fun main(args:Array<String>){
    for (eVal in enumValues<Series>()){
        val thing = "魔剤"
        println(
            eVal.type+"色の${thing}は、"
            +likeTaste(eVal)
            +"味です"
        )
    }
}

