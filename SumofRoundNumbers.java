import java.util.*;
public class SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int g=sc.nextInt();

        while(g-->0){
            int k=sc.nextInt();
            int c=0,l=1,t=0;
            ArrayList<Integer> al=new ArrayList<>();
            while(k>0){
                c++;
                if(k%10!=0){
                    t++;
                    for(int i=1;i<c;i++){
                        l=l*10;
                    }
                    int m=(k%10)*l;
                    al.add(m);
                    l=1;
                }
                k/=10;
            }

            System.out.println(t);
            for(int i=0;i<t;i++){
                System.out.print(al.get(i)+" ");
            }
        }
    }
}
