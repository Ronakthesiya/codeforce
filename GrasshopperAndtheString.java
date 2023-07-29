import java.util.*; 
public class GrasshopperAndtheString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int n=s.length();
        ArrayList<Integer> al=new ArrayList<>();
        al.add(0);
        int max=1;

        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='Y'){
                al.add(i+1);
            }
        }
        al.add(n+1);

        for(int i=0;i<al.size()-1;i++){
            int k=al.get(i+1)-al.get(i);

            if(max<k){
                max=k;
            }
        }

        System.out.println(max);
    }
}
