import java.util.*;
public class Dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int s=sc.nextInt();
        int n=sc.nextInt();

        int x[]=new int[n];
        int y[]=new int[n];

        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(x[i]>x[j]){
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;

                    temp=y[i];
                    y[i]=y[j];
                    y[j]=temp;
                }
            }
        }
        int g=1;
        for(int i=0;i<n;i++){
            if(x[i]<s){
                s=s+y[i];
            }else{
                System.out.println("NO");
                g=0;
                break;
            }
        }

        if(g==1){
            System.out.println("YES");
        }
    }
}
