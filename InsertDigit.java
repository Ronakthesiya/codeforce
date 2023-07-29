import java.util.*;
public class InsertDigit {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for(int test =0;test<t;test++){
		int n = sc.nextInt();
		int d = sc.nextInt();
		String num = sc.next();
		StringBuilder sb = new StringBuilder(num);
		for(int i =0;i<n;i++) {
			if( (num.charAt(i))<(char)(d+'0')) {
				sb.insert(i,""+d);
				break;
			}
			if(i==n-1){
			    sb.append((char)(d+'0'));
			}
		}
		System.out.println(sb.toString());
	}
}
}