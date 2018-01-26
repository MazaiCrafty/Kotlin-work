class Name(){
	var value:String="anonymous"
}

fun main(args:Array<String>){
    val userName= Name()

    println(userName.value)
    userName.value="mazaicrafty"
    println(userName.value)
    
}