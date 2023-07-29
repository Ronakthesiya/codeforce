import java.util.*;
public class ex{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        int n=s.length();
        int i=0;
        String q=s.substring(0,i)+c+s.substring(i+1,n);
        s=q;

        System.out.print(s);
    }
}