import java.util.*;
import java.io.*;

public class InputOutput{
    public static void main(String [] args) throws Exception{
    /*    int a = 12;
        short b = 6;
        char c  = 8;
        long d = 32;
        System.out.println(a / b);
        System.out.println(a + c);
        System.out.println(d * c);
        System.out.println((char) ('a'+5));*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = bufferedReader.readLine().toCharArray();
        boolean isValidWord = true;
       /* for(int i=0; i != input.length(); i++){
            if((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) continue;
            isValidWord = false;
            break;
        }*/
        //   ----   NEW FOR LOOP -----
        //   Analyze when it will run  ---
        for(char c : input){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) continue;
            isValidWord = false;
            break;
        }
        if(isValidWord) System.out.println(String.valueOf(input) + " is a valid word");
        else System.out.println("Please enter a valid word");
    }
}