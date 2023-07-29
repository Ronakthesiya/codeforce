import java.util.*;
public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            if(n<=10){
                System.out.println(n);
            }else{
                int k=0;
                int c=0;
                while(n>0){
                    k=n%10;
                    n/=10;
                    c++;
                }
                c--;
                System.out.println((9*c)+k);
            }
        }
    }
}
