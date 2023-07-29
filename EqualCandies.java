import java.util.*;
public class EqualCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> arrl=new ArrayList<Integer>();
            int k=0,sum=0;
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                k=sc.nextInt();
                arrl.add(k);
                arr[i]=k;
            }

            k=Collections.min(arrl);

            for(int i=0;i<n;i++){
                sum=sum+(arr[i]-k);
            }

            System.out.println(sum);
        }
    }
}
