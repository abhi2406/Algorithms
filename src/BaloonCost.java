import java.util.Scanner;

public class BaloonCost {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int costGreen1 = in.nextInt();
            int costPurple1 = in.nextInt();
            int nop = in.nextInt();
            int[] arrfirst = new int[nop*2+7];
            for(int k = 0; k< nop * 2; k++)
            {
                arrfirst[k] = in.nextInt();
            }
            int price1 = 0;
            int sumeven1 = 0;
            int sumodd1 = 0;
            for(int j = 0; j < nop*2; j+=2){
                sumodd1 = sumodd1 + arrfirst[j];
                sumeven1 = sumeven1 + arrfirst[j+1];
            }
            if(costGreen1>costPurple1){
                if(sumeven1>sumodd1){
                    price1 = price1 + ((costGreen1*sumodd1)+ (costPurple1*sumeven1));
                } else {
                    price1 = price1 + ((costGreen1*sumeven1)+ (costPurple1*sumodd1));
                }
            }else {
                if(sumeven1>sumodd1){
                    price1 = price1 +((costPurple1*sumodd1)+ (costGreen1*sumeven1));
                }else{
                    price1 = price1 + ((costPurple1*sumeven1)+(costGreen1*sumodd1));
                }
            }
            System.out.println(price1);
        }

    }
}
