import java.util.*;
public class twothreeMoves {
    public static int check(int n){
        if(n==1){
            return 2;
        }else if (n==0){
            return 0;
        }else{
            if(n%3==0){
                return n/3;
            }else{
                return (n/3)+1;
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            if(n<0){
                n=n*(-1);
            }

            System.out.println(check(n));
        }

        sc.close();
    }
}
