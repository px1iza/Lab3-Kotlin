class LowerCaseStrings(text: String) : Strings(text) {

    private val lowerText: String = text.lowercase()

    override fun sort(): String {
        return try {
            val sorted = lowerText.toCharArray().sortedDescending().joinToString("")
            println("Малі букви (за спаданням): $sorted")
            sorted
        } catch (e: Exception) {
            println("Помилка: ${e.message}")
            ""
        }
    }
}