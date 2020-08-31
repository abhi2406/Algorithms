import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Emaze {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int x = 0;
        int y = 0;
        for (int i = 0; i < input.length; i++){
            if(input[i]=='L'){
                x = x-1;
            }else if(input[i]=='R'){
                x = x+1;
            }else if(input[i]=='D'){
                y = y-1;
            }else if(input[i]=='U'){
                y = y+1;
            }
        }
        System.out.println(x+" "+y );
    }
}
