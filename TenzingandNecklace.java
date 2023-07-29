import java.util.*;
public class TenzingandNecklace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int h;

            long a[]=new long[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }

            if(n%k==0){
                h=n/k;
            }else{
                h=n/k;
                h++;
            }
            
            long ans=0;
            long sum=0;

            for(int m=0;m<n;m++){
                sum=0;
                int j=0;
                for(int i=m;;i+=(k)){
                    if(i>=n){
                        i-=n;
                    }
                    sum=sum+a[i];
                    j++;
                    if(j>=h){
                        break;
                    }
                }
                if(m==0){
                    ans=sum;
                }
                if(sum<ans){
                    ans=sum;
                }
            }

            System.out.println(ans);
        }
    }
}
