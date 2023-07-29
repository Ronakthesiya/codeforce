import java.util.Scanner;
public class TheatreSquare2
{
	public static void main(String[] args) {
		long n,m,a;
		Scanner sc = new Scanner(System.in);
		n=sc.nextLong();
		m=sc.nextLong();
		a=sc.nextLong();
        long t=0;

        if(m%a==0 && n%a==0){
            t=m*n/(a*a);
            System.out.print(t);
            return;
        }

        if(m==n && n==a){
            t=1;
            System.out.print(t);
            return;
        }

        if(m==n && n<a){
            t=1;
            System.out.print(t);
            return;
        }

        if(m==n && n>a){
            t=0;
            
            for(int i=1; ;i++){
                if(i*a>=n){
                    t = t + (2*i - 1);
                    break;
                }else{
                    t = t + (2*i - 1);
                }
            }
            System.out.print(t);
            return;
        }


        if(m<a && n<a){
            t=1;
            System.out.print(t);
            return;
        }

        if(m>a && n>a){
            t=0;
            if(n%a==0){
                for(int i=1;i<=m/a;i++){
                    t = t + n/a;
                }
                if(m%a>0){
                    t = t + n/a;
                }
                System.out.print(t);
                return;
            }
            if(m%a==0){
                for(int i=1;i<=n/a;i++){
                    t = t + m/a;
                }
                if(n%a>0){
                    t = t + m/a;
                }
                System.out.print(t);
                return;
            }
            for(int i=1;i<=m/a;i++){
                t = t + n/a ;
            }
            if(m%a>0){
                t = t + n/a;
            }
            if(n%a>0){
                t = t + m/a;
            }
            t++;
            System.out.print(t);
            return;
        }

        if((m==a && m!=n) || (n==a && m!=n)){
            long min = (m<n)?m:n;
            long max = (m>n)?m:n;

            if(a==min){
                t=max;
            }
            if(a==max){
                t=min;
            }
            System.out.print(t);
            return;
        }
		
	}
}