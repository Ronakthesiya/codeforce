import java.util.*;
public class UltraFastMathematician {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=a;
        int b=sc.nextInt();
        int c=0;
        while(k%10>0){
            c++;
            k=k/10;
        }
        System.out.print("1");
        int arr[]=new int[c];
        for(int i=(c-1);i<=0;i--){
            if(a%10==b%10){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
            a=a/10;
            b=b/10;
        }
        for(int i=0;i<c;i++){
            System.out.print(arr[i]);
        }
    }
}
