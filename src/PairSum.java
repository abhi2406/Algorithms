//import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 1 2 4 6 8
 *      7 9 3
 *  1 3 2 6 1
 */

public class PairSum {
    public static void main(String[] args) throws IOException {
        // Before proceeding further, make sure length
        // of str2 is larger.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = bufferedReader.readLine().split(" ");
        String str1 = inputs[0];
        String str2 = inputs[1];
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        // Take an empty String for storing result
        String str = "";

        int n1 = str1.length(), n2 = str2.length();
        int diff = n2 - n1;


        int carry = 0;


        for (int i = n1 - 1; i >= 0; i--) {

            int sum = ( (str1.charAt(i) - '0') +
                     (str2.charAt(i + diff) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }


        for (int i = n2 - n1 - 1; i >= 0; i--) {
            int sum = ( (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            str += (char) (carry + '0');

        System.out.println(new StringBuilder(str).reverse().toString());
    }
}