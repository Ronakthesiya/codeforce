import java.util.*;
public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int c=0;

        for(int i=0;;i++){
            System.out.print(s.charAt(c));
            for(int j=0;j<=i;j++){
                c++;
            }
            if(c>=s.length()){
                break;
            }
        }
    }
}
