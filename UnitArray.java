import java.util.*;
public class UnitArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int nofone=0;
            int noofmone=0;

            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==-1){
                    noofmone++;
                }else{
                    nofone++;
                }
            }

            int ans=0;

            while(1==1){
                if(noofmone<=nofone){
                    if(noofmone%2==0){
                        System.out.println(ans);
                    }else{
                        System.out.println(ans+1);
                    }
                    break;
                }

                ans++;
                noofmone--;
                nofone++;
            }
        }
    }
}
