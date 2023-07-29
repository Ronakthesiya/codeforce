import java.util.*;
public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        int arr[]=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }

        int ans=0;
        for(int i=0;i<t;i++){
            if(arr[i]<0){
                ans++;
            }else{
                i+=arr[i];
            }
        }

        System.out.println(ans);
    }
}
