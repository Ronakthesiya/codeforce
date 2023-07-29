import java.util.*;
public class Cookies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0,co=0,ce=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            if(arr[i]%2==0){
                ce++;
            }else{
                co++;
            }
        }

        if(sum%2==0){
            System.out.println(ce);
        }else{
            System.out.println(co);
        }

    }
}
