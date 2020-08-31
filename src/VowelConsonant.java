import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelConsonant {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[]  input = br.readLine().toCharArray();
        int Vowel = 0;
        int consonant = 0;
        for(char i : input){
            if((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')){
                if(i == 'a' || i == 'e'||i == 'i' ||i == 'o' || i == 'u'|| 
                        i == 'A' || i == 'E'||i == 'I' ||i == 'O' || i == 'U'){
                    Vowel = Vowel +1 ;
                }else {
                    consonant = consonant +1;
                }
                }
            }
        System.out.println(Vowel + " " +consonant);
        }
}
