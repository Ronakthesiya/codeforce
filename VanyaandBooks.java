import java.util.*;
public class VanyaandBooks {
    public static int digit(Long n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Long n=sc.nextLong();
        int dig=digit(n);
        Long ans=(long) 0;
        Long f=(long)9,s=(long)0;

        for(int i=0;dig>i;i++){
            ans+=(f-s)*(i+1);
            s=f;
            f=(f*10)+9;
        }

        ans+=(n-s)*dig;

        System.out.println(ans);
    }
}
