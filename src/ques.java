import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ques {
    public static void main(String[] args) throws IOException {
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//Integer.parseInt(in.readLine());
        int arr[] = new int[100005];
        int i=0;
        while(i<n){
            arr[i] = in.nextInt();
           // System.out.println(arr[i]);
            i++;
        }
        int index = 1;
        int ans=0;
        while(w>0&&index<=w){
            if(l.contains(index)){
                index++;continue;}
            if(index<=w){
                ans++;
                w = w-index;
                index++;
            }
        }
        System.out.println(ans);
    }
}
