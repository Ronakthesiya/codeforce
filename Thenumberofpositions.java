import java.util.*;
public class Thenumberofpositions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a+b+1>=n){
            System.out.println(n-a);
        }else{
            System.out.println(b+1);
        }
    }
}
