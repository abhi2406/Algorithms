import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntProduct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String StrA = inputs[0];
        String B = inputs[1];
        int L1 = StrA.length();
        int carry = 0;
        String StrB = "";

           for(int i = L1; i>0 ; i--){
             //  StrB = (char) ((((StrA.charAt(i) - '0') * (B.charAt(0) - '0')) + carry) % 10);
               carry = ((StrB.charAt(i) - '0')* B.charAt(0) )/10;
           }
            }
          }



