import java.util.*;
public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            if(n<10){
                System.out.println(n);
            }else{
                int c=0;
                int k=n;
                int sum=0;

                while(k>0){
                    c++;
                    k/=10;
                    sum=sum*10+1;
                }

                int j=((c-1)*9)+(n/sum);

                System.out.println(j);
            }
        }
    }
}
