import java.util.*;
public class OddSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt(),count=0;

            int arr[]=new int[2*n];

            for(int i=0;i<2*n;i++){
                arr[i]=sc.nextInt();
                count += (arr[i] % 2);
            }

            if (count == n)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
