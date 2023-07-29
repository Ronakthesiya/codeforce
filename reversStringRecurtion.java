import java.util.*;

public class reversStringRecurtion{
    public static void printrev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str, idx-1);
    }
    public static void main(String [] args){
        Scanner a=new Scanner(System.in);
        String str=a.nextLine();
        printrev(str, str.length()-1);
    }
}