import java.util.*;
public class LongComparison {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long x=sc.nextLong();
			int p1=sc.nextInt();
			long y=sc.nextLong();
			int p2=sc.nextInt();
			int diff=Math.min(p1, p2);
			p1=p1-diff;
			p2=p2-diff;
			long a=(long) (x*(Math.pow(10, p1)));
			long b=(long) (y*(Math.pow(10, p2)));
            if (a>b) {
                System.out.println(">");
            } else if (a<b) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
		}	

	} 
	

}