import java.util.*;
public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<Integer>();
            int c=0;
            al.add(c);

            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    c++;
                }else{
                    c=0;
                }
                al.add(c);
            }

            System.out.println(Collections.max(al));
        }
    }
}
