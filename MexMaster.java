import java.util.*;
public class MexMaster {
    public static void fun(int n,int arr[]){
        for(int j=0;j<n-1;j++){
            int c=0;
            for(int k=0;k<n-1-j;k++){
                if(arr[j]==arr[k]){
                    c++;
                }
            }
            if(c==(n-1)){
                System.out.println(arr[j]+1);
                return;
            }
            if(n%2==0){
                if(c<=n/2){
                    System.out.println(arr[j]);
                    return;
                }
            }else{
                if(c<=(n/2 + 1)){
                    System.out.println(arr[j]);
                    return;
                }
            }
            
            j=j+c-1;
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();

            int arr[]=new int[n];

            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }

            for(int j=0;j<n-1;j++){
                for(int k=0;k<n-1-j;k++){
                    if(arr[k]>arr[k+1]){
                        int temp=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                    }
                }
            }

            fun(n, arr);
        }
    }
}
