// 2 задание
fun main() {
    try {
        print("Введите число от 0 до 9: ")
        val num = readLine()?.toInt()
        when (num){
            0 -> println("Ноль")
            1 -> println("Один")
            2 -> println("Два")
            3 -> println("Три")
            4 -> println("Четыре")
            5 -> println("Пять")
            6 -> println("Шесть")
            7 -> println("Семь")
            8 -> println("Восемь")
            9 -> println("Девять")
            else -> println("Неверно набранное число")
        }
    }
    catch (e: Exception) {
        println(e)
    }
}