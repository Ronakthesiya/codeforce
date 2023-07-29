import java.util.*;
public class Team {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int count=0;
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            a=a+b+c;
            if(a>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
