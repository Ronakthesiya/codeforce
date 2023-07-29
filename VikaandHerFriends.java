import java.util.*;

public class VikaandHerFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            int vx = sc.nextInt();
            int vy = sc.nextInt();
            
            boolean canRunAway = true;
            
            for (int i = 0; i < k; i++) {
                int fx = sc.nextInt();
                int fy = sc.nextInt();
                
                if (Math.abs(vx - fx) + Math.abs(vy - fy) == 1) {
                    canRunAway = false;
                }
            }
            
            if (canRunAway) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
