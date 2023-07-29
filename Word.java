import java.util.*;
public class Word {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        int lw=0;
        int up=0;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>'Z'){
                lw++;
            }else{
                up++;
            }
        }

        if(lw>=up){
            System.out.println(a.toLowerCase());
        }else{
            System.out.println(a.toUpperCase());
        }
    }
}
