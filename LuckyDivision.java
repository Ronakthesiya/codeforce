import java.util.*;
public class LuckyDivision {
    public static int chack(int n){
        int k=1;
        while(n>0){
            
            if(n%10==4 || n%10==7){

            }else{
                k=0;
            }
            n=n/10;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        if(chack(n)==1){
            System.out.println("YES");
        }else{
            int k=0;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    if(chack(i)==1){
                        k=1;
                    }
                }
            }
            if(k==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
