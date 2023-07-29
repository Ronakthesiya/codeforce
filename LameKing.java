import java.util.*;
public class LameKing {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int diff=0;

            if(a<0){
                a=a*(-1);
            }
            if(b<0){
                b=b*(-1);
            }

            if(a==b){
                diff++;
            }

            if(a>b){
                diff=diff+a-b-1;
            }else{
                diff=diff+b-a-1;
            }

            System.out.println(diff+a+b);
        }
    }
}
