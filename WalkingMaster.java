import java.util.*;
public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();

            c=c-a;
            d=d-b;
            a=0;
            b=0;

            if(c-d>0 || d<0){
                System.out.println(-1);
            }else{             
                System.out.println(2*d-c);
            }
        }
    }
}
