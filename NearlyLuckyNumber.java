import java.util.*;

public class NearlyLuckyNumber{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long count=0;
	
		while(a>0){
			long b=a%10;
			if (b==4 || b==7){
				count++;
			}
			a=a/10;
		}

		if (count == 7 || count == 4) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}