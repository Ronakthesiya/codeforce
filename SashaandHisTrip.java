import java.util.*;
public class SashaandHisTrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (b >= a - 1){
            System.out.println(a - 1);
        }else{
            int sum = 0, count = 2, i, flag = 0, city = 1, x = 1;
 
            sum += b - 1;
 
            for (i = 1; i <= a - b; i++)
            {
                sum += i;
            }
 
            System.out.println(sum);
        }
    }
}
