import java.util.*;
public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            ArrayList<Character> al=new ArrayList<>();
            al.add(s.charAt(0));
            int k=0;
            for(int i=1;i<n;i++){
                if(al.contains(s.charAt(i))){
                    k=i;
                    break;
                }
                al.add(s.charAt(i));
            }
            al.clear();

            if(k==0){
                System.out.println(n);
            }else{
                String a=s.substring(0,k);
                String b=s.substring(k,n);
                int c=2;
                al.add(a.charAt(0));
                for(int i=1;i<a.length();i++){
                    if(!al.contains(a.charAt(i))){
                        c++;
                    }
                }
                al.clear();
                al.add(b.charAt(0));
                for(int i=k+1;i<b.length();i++){
                    if(!al.contains(b.charAt(i))){
                        c++;
                    }
                }
                al.clear();
                System.out.println(c);
            }
        }
    }
}
