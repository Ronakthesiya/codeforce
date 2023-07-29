import java.util.*;
public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            ArrayList<Character> al=new ArrayList<>();
            al.add(s.charAt(0));
            int k=1;

            for(int i=0;i<(n-1);i++){
                char a=s.charAt(i);
                char b=s.charAt(i+1);
                if(a!=b){
                    if(al.contains(b)){
                        k=0;
                        break;
                    }
                    al.add(b);
                }
            }

            if(k==1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
