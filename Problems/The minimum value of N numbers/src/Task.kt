import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var min = Int.MAX_VALUE
    var input: Int

    repeat(n) {
        input = scanner.nextInt()
        if (input < min) {
            min = input
        }
    }

    println(min)
}