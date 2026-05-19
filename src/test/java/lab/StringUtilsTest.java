package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse_shouldReturnNull_whenInputIsNull() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void reverse_shouldReturnEmpty_whenInputIsEmpty() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    void reverse_shouldReverseAsciiString() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    void reverse_shouldReverseUnicodeString() {
        assertEquals("анба", StringUtils.reverse("абна"));
    }

    // ---- нэмэх тестүүд ----

    @Test
    void isBlank_shouldReturnTrue_whenNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void isBlank_shouldReturnTrue_whenEmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    void isBlank_shouldReturnTrue_whenSpacesOnly() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    void isBlank_shouldReturnFalse_whenHasText() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    @Test
    void capitalize_shouldReturnNull_whenNull() {
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    void capitalize_shouldReturnEmpty_whenEmpty() {
        assertEquals("", StringUtils.capitalize(""));
    }

    @Test
    void capitalize_shouldCapitalizeFirstLetter() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    void capitalize_shouldNotChangeAlreadyCapitalized() {
        assertEquals("Hello", StringUtils.capitalize("Hello"));
    }
}