class LowerCaseStrings(text: String) : Strings(text.lowercase()) {

    override fun sort(): String {
        return try {
            // Сортуємо букви за спаданням у звичайному алфавітному порядку
            val sorted = super.text
                .lowercase()
                .toCharArray()
                .sortedByDescending { it }
                .joinToString("")

            println("Малі букви (за спаданням): $sorted")
            sorted
        } catch (e: Exception) {
            println("Помилка: ${e.message}")
            ""
        }
    }
}