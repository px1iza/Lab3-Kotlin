import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ExceptionHandlingTest {

    @Test
    fun testEmptyString() {
        val str = Strings("")
        assertEquals(0, str.length)
        assertEquals("", str.sort())
    }

    @Test
    fun testUpperCaseEmpty() {
        val str = UpperCaseStrings("")
        assertEquals("", str.sort())
    }

    @Test
    fun testLowerCaseEmpty() {
        val str = LowerCaseStrings("")
        assertEquals("", str.sort())
    }
}