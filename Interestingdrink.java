import java.util.*;
public class Interestingdrink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int q=sc.nextInt();
        int b[]=new int[q];
        for(int i=0;i<q;i++){
            b[i]=sc.nextInt();

            if(b[i]<a[0]){
                System.out.println(0);
            }else{
                int l=0;
                int h=n;
                int mid=0;

                while(h>l){
                    mid=(l+h)/2;
                    if(a[mid]<=b[i]){
                        l=(mid+1);
                    }else{
                        h=mid;
                    }
                }

                System.out.println(l);
            }
        }
    }
}
