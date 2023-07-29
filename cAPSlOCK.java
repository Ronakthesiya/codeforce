import java.util.*;
public class cAPSlOCK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        int f=0,c=0;

        if(a.charAt(0)<='z' && a.charAt(0)>='a'){
            f=1;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A' && a.charAt(i)<='Z'){
                c++;
            }
        }
        
        if (c == a.length() - 1 && f == 1)
        {
            for (int i = 0; i < a.length(); i++)
            {
                if (i == 0)
                {
                    System.out.print((char)(a.charAt(i) - 32));
                }
                else
                {
                    System.out.print((char)(a.charAt(i) + 32));
                }
            }
        }else if (c == a.length()){
            for (int i = 0; i < a.length(); i++)
            {
     
                System.out.print((char)(a.charAt(i) + 32));
            }
        }
        else{
            System.out.print(a);
        }

        
    }
}
