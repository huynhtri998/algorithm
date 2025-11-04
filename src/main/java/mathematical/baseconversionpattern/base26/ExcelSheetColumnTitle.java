package mathematical.baseconversionpattern.base26;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder st = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            int columnCharacter = columnNumber % 26;
            char ch = (char)('A' + columnCharacter);
            st.append(ch);
            columnNumber /= 26;
        }

        return st.reverse().toString();
    }
}
