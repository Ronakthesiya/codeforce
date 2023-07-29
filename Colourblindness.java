import java.util.*;
public class Colourblindness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String k=sc.nextLine();
            String l=sc.nextLine();

            k=k.replace('G','B');
            l=l.replace('G','B');

            if(k.compareTo(l)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
