import java.util.*;
public class LuoTianyiandthePalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String s=sc.nextLine();
            int m=1;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    m=0;
                    break;
                }
            }
            if(m==1){
                System.out.println(-1);
            }else{
                System.out.println(s.length()-1);
            }
        }
    }
}
