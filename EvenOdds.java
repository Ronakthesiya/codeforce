import java.util.*;
public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        long k=sc.nextLong();

        if(n%2==0){
            n=n/2;
        }else{
            n=n/2+1;
        }
        if(k<=n){
            System.out.println((2*k-1));
        }else{
            k=k-(n);
            System.out.println((2*k));
        }
    }
}
