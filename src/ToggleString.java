import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        for(int i= 0; i < input.length; i++){
            if(input[i]>= 'a' && input[i]<= 'z'){
                input[i] = (char) (input[i] + 'A' - 'a');
            } else if (input[i]>= 'A' && input[i]<= 'Z'){
                input[i] = (char) (input[i] + 'a' - 'A');
            }
        }
        System.out.println(input);
    }
}
