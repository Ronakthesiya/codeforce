import java.util.*;
public class FoodforAnimals {
    public static int check(int a,int b,int c,int x,int y){
        if(a+b+c<x+y){
            return 0;
        }
        if(a+c<x || b+c<y){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            if(check(a,b,c,x,y)==0){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}
