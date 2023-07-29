import java.util.*;
public class Twogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        ArrayList<String> al=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        String k;

        for(int i=0;i<n-1;i++){
            k=s.charAt(i)+""+s.charAt(i+1);
            al.add(k);
        }

        String l;
        int c=0,u=0;

        for(int i=0;i<al.size();i++){
            c=0;
            k=al.get(i);
            for(int j=0;j<al.size();j++){
                l=al.get(j);
                if(k.equals(l)){
                    c++;
                }
            }
            if(c>=(al.size()/2)){
                u=1;
                System.out.println(k);
                break;
            }
            al1.add(c);
        }
        int index=0;
        int max=0;
        if(u==0){
            for(int i=0;i<al.size();i++){
                if(max<al1.get(i)){
                    max=al1.get(i);
                    index=i;
                }
            }

            System.out.println(al.get(index));
        }
    }
}
