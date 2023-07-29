import java.util.*;
public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int c=0;
            int index=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

                if(a[0]!=a[i]){
                    c++;
                    index=i;
                }
            }
            if(c>1){
                System.out.println(1);
            }else{
                System.out.println(index+1);
            }
        }
    }
}
