import java.util.*;
public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();

            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int i=1;i<=n;i++){
                    System.out.print(1+" ");
                }       
                System.out.println();
            }else if(k==1 && x==1){
                System.out.println("NO");
            }else{
                int ans=0;
                int multy=0;

                for(int i=2;i<=k;i++){
                    if((n%i>=2 && n%i<=k) || n%i==0){
                        ans=i;
                        multy=n/i;
                    }
                }

                if(ans!=0 && multy!=0){
                    System.out.println("YES");
                    if(n-multy*ans!=0){
                        System.out.println(multy+1);
                    }else{
                        System.out.println(multy);
                    }
                    for(int i=1;i<=multy;i++){
                        System.out.print(ans+" ");
                    }
                    if(n-multy*ans!=0){
                        System.out.println(n-multy*ans);
                    }else{
                        System.out.println();
                    }
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
