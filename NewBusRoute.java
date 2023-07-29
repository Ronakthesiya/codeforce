import java.util.*;
public class NewBusRoute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        int c=0;

        for(int i=1;i<n;i++){
            int k=a[i]-a[i-1];
            if(k<0){
                k*=-1;
            }
            if(k<min){
                min=k;
                c=0;
            }
            if(k==min){
                c++;
            }
        }

        System.out.println(min+" "+c);
    }
}
