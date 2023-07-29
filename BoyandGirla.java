import java.util.*;

public class BoyandGirla{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        int c=a.length();
        
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    c--;
                    break;
                }
            }
        }
        
        if(c%2!=0){
            System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }
    }
}