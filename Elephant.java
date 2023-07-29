import java.util.*;
public class Elephant {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int sum=0;
        
        for(int i=5;i>=1;i--){
            sum=sum+(a/i);
            a=a%i;
        }
        System.out.println(sum);
    }
}
