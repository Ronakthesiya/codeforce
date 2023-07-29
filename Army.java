import java.util.*;
public class Army {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        int m=sc.nextInt();
        
        int sum=0;
        for(int i=k;i<m;i++){
            sum+=a[i-1];
        }
        System.out.println(sum);
    }
}
