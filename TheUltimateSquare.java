import java.util.*;
public class TheUltimateSquare {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            if(n%2!=0){
                n++;
            }
            n=n/2;

            System.out.println(n);
        }
    }
}
