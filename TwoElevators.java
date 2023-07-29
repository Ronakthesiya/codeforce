import java.util.Scanner;
public class TwoElevators {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int k=2;

            a--;

            if((c-b)>0){
                c=(c-b)+(c-1);
            }else{
                c=-(c-b)+(c-1);
            }
            if(a<c){
                k=1;
            }else if(a==c){
                k=3;
            }

            System.out.println(k);
        }
    }
}
