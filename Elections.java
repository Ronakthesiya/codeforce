import java.util.*;
public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int aBest = Math.max(Math.max(0, (b + 1) - a), (c + 1) - a);
            int bBest = Math.max(Math.max(0, (a + 1) - b), (c + 1) - b);
            int cBest = Math.max(Math.max(0, (a + 1) - c), (b + 1) - c);
            System.out.println(aBest+" "+bBest+" "+cBest);     
        }       
    }
}