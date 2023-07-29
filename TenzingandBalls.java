import java.util.*;
public class TenzingandBalls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int m=n;
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                al.add(sc.nextInt());
            }

            for(int i=0;i<n;i++){
                for(int j=n-1;j>i;j--){
                    if(al.get(i)==al.get(j)){
                        for(int k=i;k<=j;k++){
                            al.remove(k);
                            n=al.size();
                        }
                    }
                }
            }

            System.out.println(m-al.size());
        }
    }
}
