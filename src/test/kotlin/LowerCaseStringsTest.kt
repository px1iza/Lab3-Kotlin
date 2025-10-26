import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class LowerCaseStringsTest {

    @Test
    fun testLength() {
        val str = LowerCaseStrings("JAVA")
        assertEquals(4, str.length)
    }

    @Test
    fun testConstructorConvertsToLower() {
        val str = LowerCaseStrings("TEST")
        val result = str.sort()
        // Перевіряємо що всі букви малі
        assertTrue(result.all { it.isLowerCase() || !it.isLetter() })
    }

    @Test
    fun testSortDescending() {
        val str = LowerCaseStrings("abcd")
        val result = str.sort()
        assertEquals("dcba", result)
    }

    @Test
    fun testSortWithMixedCase() {
        val str = LowerCaseStrings("JaVa")
        val result = str.sort()
        assertEquals("vaja", result)
    }
}