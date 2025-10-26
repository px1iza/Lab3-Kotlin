import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
class StringsTest {

    @Test
    fun testLength() {
        val str = Strings("test")
        assertEquals(4, str.length)
    }

    @Test
    fun testLengthEmpty() {
        val str = Strings("")
        assertEquals(0, str.length)
    }

    @Test
    fun testSort() {
        val str = Strings("cba")
        val result = str.sort()
        assertEquals("abc", result)
    }

    @Test
    fun testSortMixed() {
        val str = Strings("Kotlin")
        val result = str.sort()
        assertEquals("Kilnot", result)
    }
}