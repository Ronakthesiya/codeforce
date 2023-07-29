import java.util.*;
public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();

            if(n<3){
                System.out.println(1);
            }else{
                int i=0;
                int k=x+2;
                for(i=2;i<n;i++){
                    if(n<=k){
                        System.out.println(i);
                        break;
                    }
                    k+=x;
                }
            }
        }
    }
}
