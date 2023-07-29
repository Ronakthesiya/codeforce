import java.util.*;
public class towerOfHanoi{
    public static int k=0;
    public static void towerHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disc "+1+" from "+src+" to "+dest);
            return;
        }
        towerHanoi(n-1, src, dest, helper);
        k++;
        System.out.println("transfer disc "+n+" from "+src+" to "+dest);
        towerHanoi(n-1, helper, src, dest);
        k++;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerHanoi(n, "s", "h", "d");
        System.out.println("total steps : "+(k+1));
    }
}