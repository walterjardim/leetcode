package largest_odd_number_string;

import java.math.BigInteger;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestOddNumber("52"));
    }

    public String largestOddNumber(String num) {
        String largestOdd = "";
        int lastNumber = (int) num.charAt(num.length() - 1);
        if (isOdd(lastNumber)) {
            largestOdd = num;
        } else {
            int index = num.length() - 1;
            while(index >= 0) {
                if (isOdd((int) num.charAt(index))) {
                    largestOdd = num.substring(0, index + 1);
                    break;
                }
                index--;
            }
        }

        return largestOdd;
    }

    private boolean isOdd(int number) {
        return number % 2 > 0;
    }
}