import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int factorial = 1;
        for(int i= 1; i<=N; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
