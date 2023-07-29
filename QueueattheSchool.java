import java.util.*;
public class QueueattheSchool {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String c=sc.nextLine();

        for(int i=0;i<b;i++){
            c=c.replace("BG","GB");    
        }

        System.out.print(c);
    }
}
