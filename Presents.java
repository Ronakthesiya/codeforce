import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        int a[]=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                if(a[j]==(i+1)){
                    System.out.print((j+1)+" ");
                    break;
                }
            }
        }
    }
}
