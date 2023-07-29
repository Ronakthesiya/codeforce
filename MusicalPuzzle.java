import java.util.*;
public class MusicalPuzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            ArrayList<String> al=new ArrayList<>();

            sc.nextLine();
            String s=sc.nextLine();
            int l=0;
            int k=1;

            for(int i=0;k<n;i++){
                String a=s.charAt(l)+"";
                String b=s.charAt(k)+"";
                String h=a+b;

                if(!al.contains(h)){
                    al.add(h);
                }

                l=k;
                k++;
            }

            System.out.println(al.size());
        }
    }
}
