import java.util.*;
public class NightattheMuseum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();
        int n=st.length();
        String s="a"+st;
        int ans=0;

        for(int i=0;i<n;i++){
            int k=s.charAt(i)-s.charAt(i+1);
            if(k<0){
                k*=(-1);
            }
            int m=26-k;
            if(m<0){
                m*=(-1);
            }
            ans+=(m>k)?k:m;
        }

        System.out.println(ans);
    }
}
