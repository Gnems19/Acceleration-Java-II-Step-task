package subtasks;

public class BinaryString {

    // solution 1 :
    // time complexity: O(n)

    public String binaryAdd(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

}
