import kotlin.math.sqrt

fun jarak (x1: Int, y1: Int, x2: Int, y2: Int): Double{
    val hasil: Double
    return if (x1 > x2 && y1 > y2){
        hasil = sqrt(sqrt(x1 - x2 * 1.0) + sqrt(y1 - y2 * 1.0))
        hasil
    }else {
        hasil = sqrt(sqrt(x2-x1*1.0)+sqrt(y2-y1*1.0))
        hasil
    }
}
fun main() {
    //t1(2,3) t2(8,7)
    println("Jarak antara t1(2,3) dan t2(8,7) adalah ${jarak(2,3,8,7)}")
    //t1(5,3), t2(-8, -4)
    println("Jarak antara t1(5,3) dan t2(-8,-4) adalah ${jarak(5,3,-8,-4)}")
}