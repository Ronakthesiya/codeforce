import java.util.*;
public class asyatheHipster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int min=(a>b)?b:a;
        int max=(a<b)?b:a;
        max=max-min;

        System.out.println(min+" "+(max/2));
    }
}
