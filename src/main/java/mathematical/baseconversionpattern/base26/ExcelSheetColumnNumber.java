package mathematical.baseconversionpattern.base26;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int value = 0;
        for(char ch : columnTitle.toCharArray()){
            value = (value * 26) + (ch - 'A' + 1);
        }
        return value;
    }
}
