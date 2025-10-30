import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class UpperCaseStringsTest {

    @Test
    fun testLength() {
        val str = UpperCaseStrings("kotlin")
        assertEquals(6, str.length)
    }

    @Test
    fun testConstructorConvertsToUpper() {
        val str = UpperCaseStrings("test")
        val result = str.sort()
        assertTrue(result.all { it.isUpperCase() || !it.isLetter() })
    }

    @Test
    fun testSortAscending() {
        val str = UpperCaseStrings("dcba")
        val result = str.sort()
        assertEquals("ABCD", result)
    }

    @Test
    fun testSortWithMixedCase() {
        val str = UpperCaseStrings("KoTlIn")
        val result = str.sort()
        assertEquals("IKLNOT", result)
    }
}