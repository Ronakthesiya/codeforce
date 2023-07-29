import java.util.*;
public class WrongSubtraction {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=sc.nextInt();

        for(int i=1;i<=a;i++){
            if(n%10==0){
                n=n/10;
            }else{
                n=n-1;
            }    
        }

        System.out.println(n);
    }
}
