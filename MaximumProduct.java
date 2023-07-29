import java.util.*;
public class MaximumProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Long> al=new ArrayList<>();

            for(int i=0;i<n;i++){
                al.add(sc.nextLong());
            }

            Collections.sort(al);

            long n1=al.get(0);
            long n2=al.get(1);
            long n3=al.get(2);
            long n4=al.get(3);

            long a1=al.get(n-1);
            long a2=al.get(n-2);
            long a3=al.get(n-3);
            long a4=al.get(n-4);
            long a5=al.get(n-5);

            long ans1=a1*a2*a3*a4*a5;
            long ans2=n1*n2*a3*a2*a1;
            long ans3=n1*n2*n3*n4*a1;

            long max=(ans1>ans2)?ans1:ans2;
            long ans=(ans3>max)?ans3:max;

            System.out.println(ans);
        }
    }
}
