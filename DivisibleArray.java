import java.util.*;
public class DivisibleArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int k=(n*(n+1)/2)-1;

            int m=n-k%n;

            System.out.print(m+" ");
            int j=2;

            for(int i=0;i<n-1;i++){
                System.out.print(j+" ");
                j++;
            }
        }
    }
}
