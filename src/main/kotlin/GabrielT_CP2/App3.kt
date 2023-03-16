package GabrielT_CP2

fun main() {
    val sentenceWithDoubleQuotes = "\"kalimat ini berisi tanda \" pengaruh\" besar dalam proses perkuliahan \" "
    val sentenceWithSingleQuotes = sentenceWithDoubleQuotes.replace("\"", "''")
    println(sentenceWithSingleQuotes)
}
