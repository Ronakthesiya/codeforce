import java.util.*;

public class BurningMidnightOil {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=1;

        if(n<=k){
            System.out.println(1);
        }else{
        
            for(int i=1;i<=n;i++){
                sum=sum+(k*i);
                if(sum==n){
                    System.out.println(k*i);
                    break;
                }else if(sum>n){
                    System.out.println(sum-(k*i));
                    break;
                }
            }

        }
    }
}
