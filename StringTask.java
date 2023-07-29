import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        s=s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='y' || c=='u' || c=='o' || c=='i' || c=='e'){

            }else{
                System.out.print("."+c);
            }
        }
    }
}
