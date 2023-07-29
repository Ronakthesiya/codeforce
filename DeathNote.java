import java.util.*;
public class DeathNote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long k=sc.nextLong();

        long a[]=new long[n];
        long b[]=new long[n];
        long sum=0;

        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
            sum=sum+a[i];
            b[i]=sum/k;
            sum=sum%k;
        }

        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }   
    }
}
