import java.util.*;
public class TypicalInterviewProblem {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        String k="FFBFBFFBFFBFBFFBFFBFB";
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            sc.nextLine();
            String l=sc.nextLine();

            int m=k.indexOf(l);

            if(m==-1){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}
