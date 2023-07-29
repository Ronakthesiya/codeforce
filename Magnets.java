import java.util.*;
public class Magnets {
    public static void main(String [] ars){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int t=1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                t++;
            }
        }

        System.out.println(t);
    }
}
