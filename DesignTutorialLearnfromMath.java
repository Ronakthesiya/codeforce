import java.util.*;
public class DesignTutorialLearnfromMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int j=4;j<n;j+=2){
            int k=n-j;

            for(int i=2;i<=k/2;i++){
                if(k%i==0){
                    System.out.println(j+" "+k);
                    return;
                }
            }
        }
    }
}
