import java.util.Scanner;

public class RoomLeader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = null;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            String handle = sc.next();
            int x = (sc.nextInt() * 100) - (sc.nextInt() * 50);
            for (int j = 0; j < 5; ++j) {
                x += sc.nextInt();
            }
            if (max < x) {
                max = x;
                ans = handle;
            }
        }
        System.out.println(ans);
        sc.close();
    }

}

