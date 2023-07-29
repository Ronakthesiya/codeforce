import java.util.*;
public class LongLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int n;
        long sum;
        int ans;

        while(t-->0){
            sum=0;
            ans=0;
            n=sc.nextInt();
            int a[]=new int[n];
            int k=0;
            ArrayList<Integer> al=new ArrayList<>();

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

                if(a[i]<0){
                    k=-1;
                    sum-=a[i];
                    al.add(k);
                }else if(a[i]>0){
                    k=1;
                    sum+=a[i];
                    al.add(k);
                }

                
            }

            k=1;
            int l=1;
            for(int i=0;i<al.size();i++){
                l=k;
                k=al.get(i);

                if(l==1 && k==-1){
                    ans++;
                }
            }

            System.out.println(sum+" "+ans);
        }
    }
}
