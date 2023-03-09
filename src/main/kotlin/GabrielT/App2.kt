package GabrielT

data class ArrayOfNumchar (val index: Int, val value: Char)

fun main() {
    val numchar = arrayOf(
        ArrayOfNumchar(10, 'd'),
        ArrayOfNumchar(14, 'c'),
        ArrayOfNumchar(11, 'b'),
        ArrayOfNumchar(12, 'e'),
        ArrayOfNumchar(13, 'a')
    )

    val sortedNumchar = numchar.sortedBy { it.index }

    for (ArrayOfNumchar in sortedNumchar) {
        println("${ArrayOfNumchar.index}. ${ArrayOfNumchar.value}")
    }
}