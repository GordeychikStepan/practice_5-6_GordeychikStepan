// 1 задание
fun main() {
    try {
        print("Введите 1 число: ")
        var one = readLine()?.toDouble()
        print("Введите 2 число: ")
        var two = readLine()?.toDouble()

        if (one!! > two!!){
            one += 1
            println("Первое число больше")
        }
        else if (one < two) {
            two += 1
            println("Второе число больше")
        }
        else{
            one = Math.pow(one, 3.0)
            println("Числа равны")
        }
        println("$one $two")
    }
    catch (e: Exception) {
        println(e)
    }
}