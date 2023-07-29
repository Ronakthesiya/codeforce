import java.util.*;
public class BurenkaPlayswithFractions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        long a,b,c,d;

        while(t-->0){
            a=sc.nextLong();
            b=sc.nextLong();
            c=sc.nextLong();
            d=sc.nextLong();

            if(a*d == c*b){
                System.out.println(0);
            }else{
                long k=a*d;
                long l=c*b;
                if(k*l==0 || l%k==0 || k%l==0){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }            
        }
    }
}
