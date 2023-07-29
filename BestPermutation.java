import java.util.*;
public class BestPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int j=0;
            if(n%2==0){
                for(int i=n-2;i>0;i--){
                    arr[j]=i;
                    j++;
                }
            }else{
                for(int i=1;i<=n-2;i++){
                    arr[j]=i;
                    j++;
                }
            }
            arr[j]=n-1;
            arr[j+1]=n;

            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
