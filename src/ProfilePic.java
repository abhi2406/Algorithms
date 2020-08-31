import java.util.Scanner;

public class ProfilePic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int N = in.nextInt();
        for(int i =0; i< N; i++){

            int W = in.nextInt();
            int H = in.nextInt();
            if(W<L || H<L){
                System.out.println("UPLOAD ANOTHER");
            } else if(W==H){
                System.out.println("ACCEPTED");
            } else {
                System.out.println("CROP IT");
            }
        }
    }
}
