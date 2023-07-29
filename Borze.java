import java.util.*;
public class Borze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(i<s.length()-1){
                char b=s.charAt(i+1);
                if(a=='-' && b=='-'){
                    System.out.print(2);
                    i++;
                }else if(a=='-' && b=='.'){
                    System.out.print(1);
                    i++;
                }
                else if(a=='.'){
                    System.out.print("0");
                }
            }else if(a=='.'){
                System.out.print("0");
            }
        }

    }
}
