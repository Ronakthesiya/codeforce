import java.util.*;
public class Hotelier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        String k=sc.next();
        int arr[]=new int[10];
        Arrays.fill(arr,0);

        for(int i=0;i<t;i++){
            if(k.charAt(i)=='L'){
                for(int j=0;j<t;j++){
                    if(arr[j]==0){
                        arr[j]=1;
                        break;
                    }
                }
            }else 

            if(k.charAt(i)=='R'){
                for(int j=9;j>=0;j--){
                    if(arr[j]==0){
                        arr[j]=1;
                        break;
                    }
                }
            }else{
                arr[k.charAt(i)-'0']=0;
            }
        }

        for(int i=0;i<=9;i++){
            System.out.print(arr[i]);
        }
    }
}
