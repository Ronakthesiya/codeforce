import java.util.*;
public class PolycarpandCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            if(n%3==0){
                System.out.println(n/3+" "+n/3);
            }else if(n%3==1){
                n--;
                System.out.println((n/3+1)+" "+n/3);
            }else{
                n-=2;
                System.out.println(n/3+" "+(n/3+1));
            }
        }
    }
}
