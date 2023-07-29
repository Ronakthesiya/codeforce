import java.util.*;
public class LunaticNeverContent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            ArrayList<Integer> al=new ArrayList<Integer>();

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<=n/2;i++){
                int k=arr[i]-arr[n-i-1];

                if(k<0){
                    k=k*(-1);
                }

                al.add(k);
            }

            System.out.println(Collections.max(al));
        }
    }
}
