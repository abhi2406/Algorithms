import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Lift {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int LiftA = 0;
        int LiftB = 7;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            if (Math.abs(N - LiftA) > Math.abs(N - LiftB)) {
                System.out.println("B");
                LiftB = LiftB + (N - LiftB);
            } else  {
                System.out.println("A");
                LiftA = LiftA + (N - LiftA);
            }
        }
    }
}