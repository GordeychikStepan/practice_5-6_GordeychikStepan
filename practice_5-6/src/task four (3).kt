// самостоятельное задание 3 (вариант 1)
fun main() = try {
    print("x: ")
    val x = readLine()?.toShort()
    print("y: ")
    val y = readLine()?.toShort()
    if (((x!! > 99) || (x < 1)) || ((y!! > 99) || (y < 1)))
        println("Неверно набранное число")
    else{
        when(x){
            in 7..16 -> println("x - школьный возраст")
            else -> println("x - не школьный возраст")
        }
        when(y){
            in 7..16 -> println("y - школьный возраст")
            else -> println("y - не школьный возраст")
        }
    }
}
catch (e: Exception) {
    println(e)
}