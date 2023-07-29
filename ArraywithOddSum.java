import java.util.*;
public class ArraywithOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int co=0,ce=0,sum=0;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

                if(a[i]%2==0){
                    ce++;
                }else{
                    co++;
                    sum=sum+a[i];
                }
            }

            if(sum%2!=0){
                System.out.println("YES");
            }else{
                if(co<n && co!=0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
    
        }
    }
}
