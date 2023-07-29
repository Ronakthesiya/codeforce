import java.util.*;
public class Gametwothree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int c=0;

        if(n==m){
            System.out.println(0);
        }else if(m%n != 0){
            System.out.println(-1);
        }else{
            int d=m/n;

            while(d%2==0){
                d=d/2;
                c++;
            }
            while(d%3==0){
                d=d/3;
                c++;
            }

            if(d!=1){
                System.out.println(-1);
            }else{
                System.out.println(c);
            }
        }
    }
}
