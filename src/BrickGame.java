import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BrickGame {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int i = 0;
        int Round = 0;
        int Remainder = 0;
        int j = 0;
        for(i = 1; i<N; i++){
            j = j +(i +(2*i));
            if(N<j){
                Round = i-1;
                Remainder = N- (j-(i +(2*i)));
                break;
            }
        }
        if(Remainder > Round){
            System.out.println("Motu");
        }else {
            System.out.println("Patlu");
        }
    }
}
