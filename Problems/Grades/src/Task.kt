import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    var dCount = 0
    var cCount = 0
    var bCount = 0
    var aCount = 0

    repeat(n) {
        when (scanner.nextInt()) {
            5 -> aCount++
            4 -> bCount++
            3 -> cCount++
            2 -> dCount++
        }
    }

    println("$dCount $cCount $bCount $aCount")
}