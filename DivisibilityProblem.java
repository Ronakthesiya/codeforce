import java.util.*;
public class DivisibilityProblem {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        
        int t=sc.nextInt();

        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c;
            if(a%b==0){
                c=0;
            }else{
                c=b-(a%b);
            }
            
            System.out.println(c);
        }
    }
}
