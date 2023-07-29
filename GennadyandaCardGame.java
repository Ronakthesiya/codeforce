import java.util.*;
public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        String j=sc.nextLine();
        char s1=s.charAt(0);
        char s2=s.charAt(1);
        int c=0;
        char j1,j2;

        for(int i=0;i<13;i++){
            j1=j.charAt(i);
            j2=j.charAt(i+1);
            if(j1==s1){
                c=1;
            }
            if(j2==s2){
                c=1;
            }
            i+=2;
        }

        if(c==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
