import java.util.*;
public class RomaandChangingSigns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=k;

        int a[]=new int[n];
        int sum=0;
        int min=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
            if(a[i]<0 && i<k){
                a[i]=a[i]*(-1);
                l--;
            }
            if(i==0){
                min=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
            sum=sum+a[i];
        }
        
        if(l>0 && l%2!=0){
                sum=sum-(2*a[0]);
        }

        System.out.println(sum);
    }
}
