fun main(args:Array<String>) {
    val clacs:List<(Int, Int)->Int> =
    listof(
        {a, b-> a+b},
        {a, b-> a-b},
        {a, b-> a*b}
        )

    for (clac in clacs) {
        println(showClac(1919,810,clac))
    } 
}

fun showClac(a:Int, b:Int, clas:(Int, Int)->Int): String {
    return "${calc(a,b)}"
}