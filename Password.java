import java.util.*;
public class Password {
    public static int fac(int a){
        int f=1;
        for(int i=a;i>1;i--){
            f=f*a;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int f=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0){
                    f=1;
                }
            }
            n=10-n;
            
            int k=3*n*(n-1);
            
            System.out.println(k);
        }
    }
}
