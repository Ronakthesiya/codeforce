import java.util.*;
public class CasimirsStringSolitaire {
    public static int check(String s,int k){
        if(k%2!=0){
            return 0;
        }
        int ca=0,cb=0,cc=0;
        for(int i=0;i<k;i++){
            switch(s.charAt(i)){
                case 'A':ca++;
                break;
                case 'B':cb++;
                break;
                case 'C':cc++;
                break;
            }
        }
        if(cb!=(ca+cc)){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String s=sc.nextLine();
            int k=s.length();

            if(check(s,k)==0){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
            
        }
    }
}
