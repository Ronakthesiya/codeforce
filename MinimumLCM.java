import java.util.*;
public class MinimumLCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=1;

            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    k=i;
                    break;
                }
            }

            if(k!=1){
                System.out.println(n/k+" "+(k-1)*(n/k));
            }else{
                System.out.println(1+" "+(n-1));
            }
        }
    }
}
