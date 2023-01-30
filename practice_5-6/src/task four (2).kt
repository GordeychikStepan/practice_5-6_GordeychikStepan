// самостоятельное задание 2 (вариант 1)
fun main() = try {
    print("Введите двузначное число: ")
    val num = readLine()?.toShort()
    if (num!! > 99 || num < 10)
        print("Неверно набранное число")
    else {
        when{
            num.toString().contains('8') -> print("В записи присутствует цифра 8")
            else -> print("В записи не присутствует цифра 8")
        }
    }
}
catch (e: Exception) {
    println(e)
}