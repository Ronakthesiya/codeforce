import java.util.*;
public class SashaandArrayColoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                al.add(sc.nextInt());
            }

            Collections.sort(al);
            int sum=0;

            if(n%2!=0){
                for(int i=0;i<=n/2;i++){
                    int k=-al.get(i)+al.get(n-i-1);
                    sum+=k;
                }
            }else{
                    for(int i=0;i<n/2;i++){
                    int k=-al.get(i)+al.get(n-i-1);
                    sum+=k;
                }
            }

            System.out.println(sum);
        }
    }
}
