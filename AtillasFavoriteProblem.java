import java.util.*;
public class AtillasFavoriteProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            int max=s.charAt(0);
            for(int i=1;i<n;i++){
                int a=s.charAt(i);
                if(max<a){
                    max=a;
                }
            }
            System.out.println(max-96);
        }
    }
}
