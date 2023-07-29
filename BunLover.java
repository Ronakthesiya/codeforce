import java.util.Scanner;

public class BunLover {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();
            long ans=1+(4*n)+(n-1);
            n=n-2;
            ans+=n*(n+1);

            System.out.println(ans);
        }
    }
}
