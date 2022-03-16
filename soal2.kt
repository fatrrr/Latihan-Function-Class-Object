import kotlin.math.pow

fun main (){
    val pangkat = {num1: Int, num2: Int -> num1.toDouble().pow(num2)}
    println("4 pangkat 3 = ${pangkat(4,3)}")
}