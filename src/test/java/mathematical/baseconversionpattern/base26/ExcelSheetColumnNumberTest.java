package mathematical.baseconversionpattern.base26;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ExcelSheetColumnNumberTest {

    private final ExcelSheetColumnNumber converter = new ExcelSheetColumnNumber();

    @ParameterizedTest
    @CsvSource({
            "A, 1",
            "Z, 26",
            "AA, 27",
            "AB, 28",
            "ZY, 701"
    })
    void testTitleToNumber(String columnTitle, int expectedColumnNumber) {
        assertEquals(1, converter.titleToNumber("A"));
    }

}
