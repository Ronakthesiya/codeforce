import java.util.*;
public class Minority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();
        int c0=0,c1=0;
        String s;

        while(t-->0){
            s=sc.nextLine();
            c0=0;
            c1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    c0++;
                }else{
                    c1++;
                }
            }

            if(c0>c1){
                System.out.println(c1);
            }else if(c0<c1){
                System.out.println(c0);
            }else{
                System.out.println(c1-1);
            }
        }
    }
}
