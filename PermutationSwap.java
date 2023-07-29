import java.util.*;
public class PermutationSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            ArrayList<Integer> al=new ArrayList<>();
            int j=1;

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]-j>0){
                    al.add(arr[i]-j);
                }else{
                    al.add(j-arr[i]);
                }
                j++;
            }

            int max=Collections.max(al);

            for(int i=max;i>=1;i--){
                int f=1;
                if(al.contains(i)){
                    for(int k=0;k<n;k++){
                        if(al.get(k)%i!=0){
                            f=0;
                            break;
                        }
                    }
                    if(f==1){
                        System.out.println(i);
                        break;
                    }
                }
                
            }
            
        }
    }
}
