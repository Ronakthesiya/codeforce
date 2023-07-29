import java.util.*;
public class MinMaxSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                if(a[i]<b[i]){
                    int temp=a[i];
                    a[i]=b[i];
                    b[i]=temp;
                }
            }

            int max=a[0],max1=b[0];
            for(int i=0;i<n;i++){
                if(max<=a[i]){
                    max=a[i];
                }
                if(max1<=b[i]){
                    max1=b[i];
                }
            }

            System.out.println(max*max1);
        }
    }
}
