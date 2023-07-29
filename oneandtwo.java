import java.util.*;

public class oneandtwo {
    public static void ronak(int count,int arr[],int n){
        if(count%2!=0){
            System.out.println("-1");
            return;
        }

        if(count==0){
            System.out.println("1");
            return;
        }

        int count2=0;
        for(int k=0;k<n;k++){
            if(arr[k]==2){
                count2++;
            }
            if(count2==(count/2)){
                System.out.println(k+1);
                return;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];

            int count=0;
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                if(arr[j]==2){
                    count++;
                }
            }

            ronak(count,arr,n);
            
        }
    }
}