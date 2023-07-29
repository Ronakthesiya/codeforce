import java.util.*;
public class AlyonaandMex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==1){
                c=1;
            }
        }

        if(c==0){
            System.out.println(1);
        }else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[j]<a[i]){
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
            int i=0;
            int g=0;
            for(i=1;i<=n;i++){
                int f=0;
                for(int j=i;j<n;j++){
                    if(a[j]>=i){
                        a[j]=i;
                        f=1;
                        break;
                    }
                }
                if(f==0){
                    System.out.print(i);
                    g=1;
                    break;
                }
            }
            if(g==0){
            System.out.println(i+1);
            }
        }
    }
}
