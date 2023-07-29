import java.util.*;
public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            al.add(a);
            sum=sum+a;
        }

        int max=Collections.max(al);

        int j=(n*max)-sum;

        System.out.println(j);
    }
}
