import java.util.*;
public class RisingSand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            int ans=0;

            for(int i=1;i<n-1;i++){
                if(a[i]>a[i-1]+a[i+1]){
                    ans++;
                }
            }
            if(k==1){
                ans=(n-1)/2;
            }
            System.out.println(ans);
        }
    }
}
