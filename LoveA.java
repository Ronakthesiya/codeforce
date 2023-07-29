import java.util.*;
public class LoveA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int n=s.length();
        int c=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                c++;
            }
        }

        if((c*2-1)<n){
            System.out.println(c*2-1);
        }else{
            System.out.println(n);
        }
    }
}
