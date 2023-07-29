import java.util.*;
public class WalkingBoy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int a[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int c=0;
            if(a[0]>=120){
                c++;
            }
            if(1440-a[n-1]>=120){
                c++;
            }
            if(a[0]>=240){
                c++;
            }
            if(1440-a[n-1]>=240){
                c++;
            }

            for(int i=0;i<n-1;i++){
                if(a[i+1]-a[i]>=120){
                    c++;
                }
                if(a[i+1]-a[i]>=240){
                    c++;
                }
                if(c>=2){
                    break;
                }
            }

            if(c>=2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
