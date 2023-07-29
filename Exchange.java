import java.util.*;
public class Exchange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(b<a){
                System.out.println(1);
            }else{
                if(n%a==0){
                    System.out.println(n/a);
                }else{
                    System.out.println((n/a)+1);
                }
            }
        }
    }
}
