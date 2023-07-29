import java.util.*;
public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(a==2){
            if(b==3){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            a+=2;
            while(1==1){
                int f=1;
                for(int i=2;i<=b/2;i++){
                    if(a%i==0){
                        f=0;
                        break;
                    }
                }
                if(f==1){
                    if(a==b){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                    break;
                }
                a+=2;
            }
        }
    }
}
