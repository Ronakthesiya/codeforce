import java.util.*;
public class PolycarpandtheDayofPi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a="314159265358979323846264338327";
        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String b=sc.nextLine();
            int c=0;

            for(int i=0;i<b.length();i++){
                if(b.charAt(i)==a.charAt(i)){
                    c++;
                }else{
                    break;
                }
            }

            System.out.println(c);
        }
    }
}
