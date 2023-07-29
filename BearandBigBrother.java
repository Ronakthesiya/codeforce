import java.util.*;
public class BearandBigBrother {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=0;
        for(i=1; ;i++){
            a=a*3;
            b=b*2;
            if(a>b){
                break;
            }
        }
        System.out.print(i);
    }
}
