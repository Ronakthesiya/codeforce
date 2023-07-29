import java.util.*;
public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            double n=sc.nextLong();
            double k=2;
            int pow=1;

            while(true){
                if(k>n){
                    System.out.println("YES");
                    break;
                }
                k=Math.pow(2,pow);
                pow++;
                if(k==n){
                    System.out.println("NO");
                    break;
                }
            }
        }
    }
}
