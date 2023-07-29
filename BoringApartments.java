import java.util.*;
public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int ans=((n%10)-1)*10;
            int c=0;
            while(n>0){
                c++;
                n/=10;
            }

            if(c==4){
                ans+=10;
            }else if(c==3){
                ans+=6;
            }else if(c==2){
                ans+=3;
            }else{
                ans+=1;
            }

            System.out.println(ans);
        }
    }
}
