import java.util.*;
public class Juicer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int b=sc.nextInt();
        int d=sc.nextInt();

        int arr[]=new int[n];
        int sum=0,c=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

            if(arr[i]<=b){
                sum=sum+arr[i];
            }

            if(sum>d){
                sum=0;
                c++;
            }
        }

        System.out.println(c);
    }    
}
