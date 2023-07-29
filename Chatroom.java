import java.util.*;
public class Chatroom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String ans="hello";
        int n=s.length();
        int c=0,j=0;

        for(int i=0;i<n  && j<5;i++){
            if(s.charAt(i)==ans.charAt(j)){
                j++;
                c++;
            }
        }
        

        if(c==5){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
