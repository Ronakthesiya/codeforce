import java.util.*;
public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int a[]=new int[4];

            for(int i=0;i<4;i++){
                a[i]=sc.nextInt();
            }

            int m1=(a[0]>a[1])?a[0]:a[1];
            int m2=(a[2]>a[3])?a[2]:a[3];

            for(int i=0;i<4;i++){
                for(int j=i+1;j<4;j++){
                    if(a[i]<a[j]){
                        int k=a[i];
                        a[i]=a[j];
                        a[j]=k;
                    }
                }
            }

            if((m1==a[0]&&m2==a[1]) || (m1==a[1]&&m2==a[0])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
