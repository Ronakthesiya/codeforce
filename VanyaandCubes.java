import java.util.*;
public class VanyaandCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0,k=0;

        for(int i=1;n>0;i++){
            sum=sum+i;
            if(n>=sum){
                k=i;
            }
            n=n-sum;
        }

        System.out.println(k);
    }
}
