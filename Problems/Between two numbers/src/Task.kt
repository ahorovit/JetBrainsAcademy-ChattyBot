import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()
    val low = scanner.nextInt()
    val high = scanner.nextInt()
    
    println(input in low..high)
}
