import java.util.*;
public class Queriesaboutlessorequalelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int [m];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int c=0;
            b[i]=sc.nextInt();

            for(int j=0;j<n;j++){
                if(b[i]>=a[j]){
                    c++;
                }
            }

            System.out.print(c+" ");
        }
    }
}
