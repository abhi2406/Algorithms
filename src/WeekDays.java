import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDays {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int A = Integer.parseInt(br.readLine());
        String[] arrday = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println(arrday[A-1]);


    }
}
