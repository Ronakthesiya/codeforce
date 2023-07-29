import java.util.*;
public class Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int p=a;

        a=3*p/10;
        c=p-(p/250*c);

        if(a<c){
            a=c;
        }

        p=b;

        b=3*p/10;
        d=p-(p/250*d);

        if(b<d){
            b=d;
        }

        if(a>b){
            System.out.println("Misha");
        }else if(b>a){
            System.out.println("Vasya");
        }else{
            System.out.println("Tie");
        }

    }
}
