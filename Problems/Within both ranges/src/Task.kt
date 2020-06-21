import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val low1 = scanner.nextInt()
    val high1 = scanner.nextInt()
    val low2 = scanner.nextInt()
    val high2 = scanner.nextInt()
    val input = scanner.nextInt()

    println(input in low1..high1 && input in low2..high2)
}