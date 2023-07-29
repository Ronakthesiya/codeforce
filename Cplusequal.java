import java.util.*;
public class Cplusequal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int k=0;

            if(a<b){
                int temp=a;
                a=b;
                b=temp;
            }

            while(a<=c && b<=c){
                b+=a;
                k++;
                if(a>c || b>c){
                    break;
                }
                a+=b;
                k++;
            }

            System.out.println(k);
        }
    }
}
