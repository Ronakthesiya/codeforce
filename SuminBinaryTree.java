import java.util.*;
public class SuminBinaryTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            long n=sc.nextLong();
            long sum=n;

            while(n>=1){
                sum=sum+(n/2);
                n=n/2;
            }

            System.out.println(sum);
        }
    }
}
