import java.util.*;
public class StartUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        StringBuffer s1=new StringBuffer(s);
        s1=s1.reverse();
        int n=s.length();
        char a,b;
        int c=1;
        for(int i=0;i<n;i++){
            a=s.charAt(i);
            b=s1.charAt(i);
            if(a!=b){
                c=0;
                break;
            }
            if(a=='A' ||a=='H' ||a=='I' ||a=='M'||a=='O' ||a=='T' ||a=='U' ||a=='V' ||a=='W' ||a=='X' ||a=='Y'){

            }else{
                c=0;
                break;
            }
        }

        if(c==0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
