import java.util.*;
public class FreeCash {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans=0;
        int max=0;
        int arr[][]=new int[n][2];

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }

            if(i!=0){
                if(arr[i-1][0]==arr[i][0] && arr[i-1][1]==arr[i][1]){
                    ans++;
                    if(ans>max){
                        max=ans;
                    }
                }else{
                    if(ans>max){
                        max=ans;
                    }
                    ans=0;
                }
            }
        }

        System.out.println(max+1);
    }
}
