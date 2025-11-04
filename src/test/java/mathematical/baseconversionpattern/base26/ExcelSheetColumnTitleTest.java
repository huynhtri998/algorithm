package mathematical.baseconversionpattern.base26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnTitleTest {

    @Test
    void testSingleLetters() {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assertEquals("A", s.convertToTitle(1));
        assertEquals("Z", s.convertToTitle(26));
    }

    @Test
    void testDoubleLetters() {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assertEquals("AA", s.convertToTitle(27));
        assertEquals("AB", s.convertToTitle(28));
        assertEquals("AZ", s.convertToTitle(52));
    }

    @Test
    void testGivenExample() {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assertEquals("ZY", s.convertToTitle(701));
    }

    @Test
    void testLarger() {
        ExcelSheetColumnTitle s = new ExcelSheetColumnTitle();
        assertEquals("FXSHRXW", s.convertToTitle(Integer.MAX_VALUE));
    }
}
