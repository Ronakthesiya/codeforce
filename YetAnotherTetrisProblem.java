import java.util.*;
public class YetAnotherTetrisProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int a[]=new int[n];
            int max=0;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>max){
                    max=a[i];
                }
            }

            int k=1;
            for(int i=0;i<n;i++){
                if(a[i]!=max){
                    if((max-a[i])%2!=0){
                        k=0;
                        break;
                    }
                }
            }

            if(k==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
