import java.util.*;
public class Businesstrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<12;i++){
            al.add(sc.nextInt());
        }

        Collections.sort(al);

        int sum=0;
        int c=0;

        for(int i=11;i>=0;i--){
            sum+=al.get(i);
            c++;
            if(sum>=k){
                break;
            }
        }

        if(sum<k){
            c=-1;
        }

        if(k==0){c=0;}

        System.out.println(c);
    }
}
