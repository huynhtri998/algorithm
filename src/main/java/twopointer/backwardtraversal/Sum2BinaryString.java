package twopointer.backwardtraversal;

public class Sum2BinaryString {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder st = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int elementA = i >= 0 ? (a.charAt(i) - '0') : 0;
            int elementB = j >= 0 ? (b.charAt(j) - '0') : 0;

            int sum = elementA + elementB + carry;

            st.append(sum%2);
            carry = sum/2;

            i--; j--;
        }

        return st.reverse().toString();
    }
}
