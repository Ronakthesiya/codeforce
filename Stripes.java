import java.util.Scanner;
 
public class Stripes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int r = 1;
            for (int i = 0; i < 8; i++) {
                String str = sc.next();
                if (str.equals("RRRRRRRR")) {
                    r=0;
                }
            }
            if (r==0){
                System.out.println("R");
            }else{
                System.out.println("B");
            }
        }
    }
}
