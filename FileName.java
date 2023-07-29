import java.util.*;
public class FileName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        
        int l=s.length();
        int ct=0;
        int c=1;

        for(int i=0;i<l-1;i++){
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            

            if(a=='x' && b==a){
                c++;
            }else{
                if(c>=3){
                    ct=ct+c-2;
                }
                c=1;
            }
        }

        if(c>=3){
            ct=ct+c-2;
        }

        System.out.println(ct);
    }
}
