import java.util.*;
public class HayatoandSchool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int k[]=new int[n];
            ArrayList<Integer> odd=new ArrayList<>();
            ArrayList<Integer> even=new ArrayList<>();

            for(int i=0;i<n;i++){
                k[i]=sc.nextInt();

                if(k[i]%2==0){
                    even.add(i);
                }else{
                    odd.add(i);
                }
            }

            int a=even.size();
            int b=odd.size();

            if(b>=3){
                System.out.println("YES");
                System.out.println((odd.get(0)+1)+" "+(odd.get(1)+1)+" "+(odd.get(2)+1));
            }else if(b>=1 && a>=2){
                System.out.println("YES");
                System.out.println((odd.get(0)+1)+" "+(even.get(0)+1)+" "+(even.get(1)+1));
            }else{
                System.out.println("NO");
            }
        }
    }
}
