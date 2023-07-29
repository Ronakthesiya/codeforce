import java.util.*;
public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<Character> al=new ArrayList<>();

        al.add('c');
        al.add('o');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('r');
        al.add('s');

        while(t-->0){
            char c=sc.next().charAt(0);

            if(al.contains(c)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
