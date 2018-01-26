fun main(args:Array<String>) {
    val tadokoro = 24
    val tnok = 19

    val diff =
    if (tadokoro > tnok) {
        println("田所(24歳、学生です)年上")
        tadokoro-tnok
    }
    else {
        println("谷岡年上")
        tnok-tadokoro
    }

    println("年の差${diff}")
}

