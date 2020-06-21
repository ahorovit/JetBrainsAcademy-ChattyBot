import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val output = if (input % 2 == 0) "EVEN" else "ODD"

    println(output)
}