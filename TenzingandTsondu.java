import java.util.*;
public class TenzingandTsondu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int ts=sc.nextInt();
            int te=sc.nextInt();

            long tts=0,tte=0;

            long arr1[]=new long[ts];
            long arr2[]=new long[te];

            for(int i=0;i<ts;i++){
                arr1[i]=sc.nextLong();
                tts+=arr1[i];
            }

            for(int i=0;i<te;i++){
                arr2[i]=sc.nextLong();
                tte+=arr2[i];
            }

            if(tts==tte){
                System.out.println("Draw");
            }else if(tts>tte){
                System.out.println("Tsondu");
            }else{
                System.out.println("Tenzing");
            }
        }
    }
}
