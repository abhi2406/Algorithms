
import java.io.BufferedReader;
import java.io.InputStreamReader;


class PrintInteger {
    public static void main(String[] args ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //Length of Array
        String s= br.readLine(); //Input the number seperated by space
        int[] arr= new int[num];
        String[] s1 = s.split(" ");
        for(int i=0;i<num;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }

        for (int element: arr) {
            System.out.print(element+ " ");
        }
    }
}
