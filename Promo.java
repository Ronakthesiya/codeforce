import java.util.*;
public class Promo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int q=sc.nextInt();

        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }

        Collections.sort(al);
        Collections.reverse(al);

        while(q-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=0;

            for(int i=x-y ; i<x ; i++){
                sum+=al.get(i);
            }

            System.out.println(sum);
        }
    }
}
