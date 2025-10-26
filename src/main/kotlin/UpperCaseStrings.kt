class UpperCaseStrings(text: String) : Strings(text) {

    private val upperText: String = text.uppercase()

    override fun sort(): String {
        return try {
            val sorted = upperText.toCharArray().sorted().joinToString("")
            println("Великі букви (за зростанням): $sorted")
            sorted
        } catch (e: Exception) {
            println("Помилка: ${e.message}")
            ""
        }
    }
}