import java.util.*;
public class Translation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        String b=sc.nextLine();
        int j=b.length()-1;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(j)){
                System.out.println("NO");
                return;
            }
            j--;
        }
        System.out.println("YES");
    }
}
