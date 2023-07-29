import java.util.*;
public class TheStringHasaTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            char a[]=new char[n];

            String s=sc.next();

            for(int i=0;i<n;i++){
                a[i]=s.charAt(i);
            }

            int min=a[n-1];
            int index=n-1;

            for(int i=n-1;i>=0;i--){
                int k=a[i];
                if(k<min){
                    min=k;
                    index=i;
                }
            }

            System.out.print((char)min);
            for(int i=0;i<n;i++){
                if(i!=index)System.out.print(a[i]);
            }

            System.out.println();
        }
    }    
}
