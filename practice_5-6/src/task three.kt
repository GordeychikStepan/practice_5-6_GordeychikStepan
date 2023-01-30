// 3 задание
fun main() {
    try {
        print("Введите возраст: ")
        val num = readLine()?.toInt()
        when (num){
            in 0..2 -> println("Младенечество")
            in 3..10 -> println("Детство")
            in 11..16 -> println("Подростковый")
            in 17..22 -> println("Юнешеский")
            in 23..35 -> println("Молодость")
            in 36..60 -> println("Зрелость")
            in 61..80 -> println("Преклонный возраст")
            in 81..99 -> println("Старость")
            else -> println("Неверно набранное число")
        }
    }
    catch (e: Exception) {
        println(e)
    }
}