import java.util.*;
public class Indivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int sum=n*(n+1)/2;

            if(n==1){
                System.out.println(1);
            }else{

            if(sum%n==0){
                System.out.println(-1);
            }else{
                for(int i=1;i<=n;i++){
                    System.out.print(i+" ");
                }
            }

        }
        }
    }
}
