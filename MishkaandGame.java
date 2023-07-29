import java.util.*;
public class MishkaandGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int m=0,c=0;

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();

            if(a>b){
                m++;
            }else if(a<b){
                c++;
            }
        }

        if(m>c){
            System.out.println("Mishka");
        }else if(m==c){
            System.out.println("Friendship is magic!^^");
        }else{
            System.out.println("Chris");
        }
    }
}
