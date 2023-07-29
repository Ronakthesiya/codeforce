import java.util.*;
public class Tram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int[] a=new int[t];
        int[] b=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int[] c=new int[t-1];

        int k=0,l=0;
        for(int i=0;i<t-1;i++){
            c[l]=k+b[i];
            k=c[l];
            k=k-a[i+1];
            l++;
        }
        
        int max=c[0];

        for(int i=0;i<t-1;i++){
            if(max<c[i]){
                max=c[i];
            }
        }

        System.out.println(max);
    }

}
