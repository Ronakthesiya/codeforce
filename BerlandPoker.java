import java.util.*;
public class BerlandPoker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();

            int j=n/k;
            int ans;
            if(j>=m){
                ans=m;
            }else{
                k--;
                int l=m-j;

                if(l%k==0){
                    ans=j-(l/k);
                }else{
                    ans=j-(l/k)-1;
                }
            }
            
            System.out.println(ans);
        }
    }
}
