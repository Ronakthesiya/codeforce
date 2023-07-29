import java.util.*;
public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();

            if(n!=5){
                System.out.println("no");
            }else{
                int f=0;
                for(int i=0;i<5;i++){
                    char k=s.charAt(i);
                    if(k=='T' || k=='i' || k=='m' || k=='u' || k=='r'){
                        f=1;
                    }else{
                        f=0;
                        break;
                    }
                }

                if(f!=0){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
