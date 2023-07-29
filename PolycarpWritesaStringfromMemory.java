import java.util.*;
 
public class PolycarpWritesaStringfromMemory {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
			String s = in.next();
			
			int cnt = 0;
			HashSet a = new HashSet();
			for(int i=0;i<s.length();i++){
				a.add(s.charAt(i));
				if(a.size()==4){
					cnt++;
					a.clear();
					i--;
				}
			}
			if(a.size()>0)
			cnt++;
			System.out.println(cnt);
		}
	}
}