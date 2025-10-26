open class Strings(private var text: String) {

    val length: Int
        get() = text.length

    protected val textValue: String
        get() = text

    open fun sort(): String {
        return try {
            val sorted = text.toCharArray().sorted().joinToString("")
            println("Базове сортування: $sorted")
            sorted
        } catch (e: Exception) {
            println("Помилка: ${e.message}")
            ""
        }
    }
}