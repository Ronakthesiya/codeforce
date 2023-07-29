import java.util.*;
public class ComparisonString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String k=sc.nextLine();
            char c;
            int l=100;
            ArrayList<Integer> al=new ArrayList<>();
            al.add(l);
            for(int i=0;i<n;i++){
                c=k.charAt(i);
                if(c=='>'){
                    l--;
                }else{
                    l++;
                }
                if(!al.contains(l)){
                    al.add(l);
                }
            }

            System.out.println(al.size());
        }
    }
}
