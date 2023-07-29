import java.util.*;

public class KarinaAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while (t > 0) {
            n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            System.out.println(Math.max((a[0] * a[1]), (a[n - 1] * a[n - 2])));
            t--;
        }
        sc.close();
    }
}