// самостоятельное задание 1 (вариант 1)
import kotlin.math.pow
fun main() = try {
    print("x: ")
    val x = readLine()?.toDouble()
    val result: Double
    if (x!! <= 3){
        result = (x.pow(2.0)) - (3 * x) + 9
    }
    else{
        result = 1 / (x.pow(3.0) + 6)
    }
    println("F(x) = $result")
}
catch (e: Exception) {
    println(e)
}