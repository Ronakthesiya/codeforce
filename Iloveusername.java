import java.util.*;
public class Iloveusername {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=0,m;
        int c=0;

        for(int i=1;i<=n;i++){
            m=sc.nextInt();
            if(i==2){
                k=m;
            }
            if(k<m){
                c++;
                k=m;
            }
        }

        System.out.println(c);
    }
}
