import java.util.*;
public class TheatreSquare {
    private static long total=0;
    public static void ladi(long n,long m,long a){
        if(n<=a && m<=a){
            total++;
            return ;
        }
        
        if(n%a==0 && m%a==0){
            total=n*m;
            return ;
        }

        if(n%a!=0){
            total=total+(n/a)+1;
        }else{
            total=total+(n/a);
        }
        if(m%a!=0){
            total=total+(m/a);
        }else{
            total=total+(m/a);
        }
        
        n=n%a;
        m=m%a;

        ladi(n,m,a);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();

        ladi(n,m,a);

        System.out.println(total);
    }
}
