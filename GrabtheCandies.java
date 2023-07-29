import java.util.*;
public class GrabtheCandies {
    public static void check(int bianca,int mihai,int cb,int cm){
        if(bianca>=mihai){
            System.out.println("no");
            return;
        }
  
        System.out.println("yes");
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int mihai=0,bianca=0;
            int cm=0,cb=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    mihai=mihai+arr[i];
                    cm++;
                }else{
                    bianca=bianca+arr[i];
                    cb++;
                }
            }
            check(bianca,mihai,cb,cm);
        }
    }
}
