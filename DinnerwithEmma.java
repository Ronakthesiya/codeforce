import java.util.*;
public class DinnerwithEmma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        long a[]=new long[n];
        long min;

        for(int i=0;i<n;i++){
            min=1000000000;
            for(int j=0;j<m;j++){
                int k=sc.nextInt();
                if(k<min){
                    min=k;
                }
            }
            a[i]=min;
        }

        long max=0;        
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println(max);
    }
}
