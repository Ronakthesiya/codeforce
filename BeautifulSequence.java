import java.util.*;
public class BeautifulSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int a[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int f=0;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(1+i==a[j]){
                        f=1;
                        break;
                    }
                }
                if(f==1){
                    break;
                }
            }

            if(f==1){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
