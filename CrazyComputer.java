import java.util.*;
public class CrazyComputer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Long c=sc.nextLong();
        int ans=1;

        ArrayList<Long> al=new ArrayList<>();

        for(int i=0;i<n;i++){
            al.add(sc.nextLong());
        }
        Long a;
        Long b;
        for(int i=n-1;i>=1;i--){
            a=al.get(i);
            b=al.get(i-1);

            if(a-b<=c){
                ans++;
            }else{
                break;
            }
        }

        System.out.println(ans);
    }
}
