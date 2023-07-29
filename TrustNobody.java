import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TrustNobody {
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
            int k;
            int m;
            int c=0;
            int l=-1;

            for(int i=0;i<n;i++){
                k=al.get(i);
                for(int j=i+1;j<n;j++){
                    m=al.get(j);
                    if(k!=m){
                        c++;
                    }
                }
                if(c>=k){
                    l=k;
                    break;
                }
            }

            System.out.println(l);
        }
    }
}
