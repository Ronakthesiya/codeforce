import java.util.*;
public class Sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=m;
        int arr[]=new int[n];
        int cn=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                cn++;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    k--;
                }
            }
            if(k==0){
                break;
            }
        }
        int sum=0;

        if(cn<m){
            for(int i=0;i<cn;i++){
                sum=sum+arr[i];
            }
        }else{
            for(int i=0;i<m;i++){
                sum=sum+arr[i];
            }
        }

        System.out.println(sum*(-1));
    }
}
