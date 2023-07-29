import java.util.*;
public class SystemofEquations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int b=0;
        int ans=0;
        for (int a = 0; a * a <= n && a <= m; a++){
            b = n - a * a;
            if (a + b * b == m)
            {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}