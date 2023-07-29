import java.util.*;
public class CipherShifer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();

            String s=sc.nextLine();
            String k="";

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(s.charAt(i)==s.charAt(j)){
                        k+=s.charAt(i);
                        i=j;
                        break;
                    }
                }
            }

            System.out.println(k);
        }
    }
}
