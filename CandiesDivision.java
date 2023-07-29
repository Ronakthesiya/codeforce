import java.util.*;
public class CandiesDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=0,b=0;
            int n=sc.nextInt();
            int k=sc.nextInt();

            a=(n/k)*k;
            
            b=n%k;

            if(b>=k/2){
                b=k/2;
            }

            System.out.println(a+b);
        }
    }
}
