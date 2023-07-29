import java.util.*;
public class FrogJumping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();

            long ans=(a-b)*(k/2);

            if(k%2!=0){
                ans+=a;
            }

            System.out.println(ans);
        }
    }
}
