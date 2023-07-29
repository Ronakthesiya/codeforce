import java.util.*;
public class Queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int sum=0,c=0;
        for(int i=0;i<n;i++){
            if(arr[i]<sum){
                c++;
            }
            sum+=arr[i];
        }

        System.out.println(n-c);
    }
}
