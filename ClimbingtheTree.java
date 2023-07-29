import java.util.*;
public class ClimbingtheTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=0;

            while(n-->0){
                int q=sc.nextInt();
                int day;
                int q1=0;
                int q2=-1;

                if(q==1){
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    q1=0;
                    day=a+((c-1)*(a-b));
                    if(day>=k){
                        k=day;
                        q1=1;
                    }
                    System.out.print(q1+" ");
                }

                if(q==2){
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=0;
                    for(int i=1;i<=k;i++){
                        c=c+a;
                        if(c>=k){
                            q2=i;
                            break;
                        }
                        c=c-b;
                        if(c>=k){
                            q2=i;
                            break;
                        }
                    }
                    System.out.print(q2+" ");
                }
            }
            System.out.println();
        }
    }
}
