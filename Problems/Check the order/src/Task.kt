import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var isSorted = "YES"
    var input: Int
    var last = Int.MIN_VALUE

    for (i in 1..n) {
        input = scanner.nextInt()

        if (input < last) {
            isSorted = "NO"
            break
        }

        last = input
    }

    println(isSorted)
}