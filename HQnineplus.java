import java.util.*;
public class HQnineplus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        int a=s.indexOf("H");
        int b=s.indexOf("Q");
        int c=s.indexOf("9");

        if(a>=0 || b>=0 || c>=0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
