import java.util.*;
public class Increasing {
    public static void check(int n,int arr[]){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            String a="yes";

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            check(n,arr);
        }
    }
}
