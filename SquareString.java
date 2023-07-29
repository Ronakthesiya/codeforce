import java.util.*;
public class SquareString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String s=sc.nextLine();
            int k=s.length();
            if(k%2!=0){
                System.out.println("NO");
            }else{
                String a=s.substring(0,k/2);
                String b=s.substring(k/2,k);

                if(a.compareTo(b)==0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
