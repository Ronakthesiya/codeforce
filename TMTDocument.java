import java.util.*;
public class TMTDocument {
    public static String chack(int n,String s){
        int noT=0,noM=0;
        ArrayList<Integer> t=new ArrayList<>();
        ArrayList<Integer> m=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='T'){
                noT++;
                t.add(i);
            }
            if(s.charAt(i)=='M'){
                noM++;
                m.add(i);
            }
        }
        
        if(noT!=(2*noM))
        {
            return "NO";
        }
        for(int i=0;i<noM;i++)
        {
            if(t.get(i)>m.get(i) || m.get(i)>t.get(i+noM))
            {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();

            System.out.println(chack(n,s));
        }
    }
}
