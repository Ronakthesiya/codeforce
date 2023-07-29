import java.util.*;
public class PetrandBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        int a[]=new int[7];
        int an=0;
        int sum=0;

        for(int i=0;i<7;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
            if(a[i]!=0){
                an=i+1;
            }
        }

        int k=n%sum;

        if(k==0){
            System.out.println(an);
        }else{

        for(int i=0;i<7;i++){
            k-=a[i];
            if(k<=0){
                System.out.println(i+1);
                return;
            }
        }

    }
    }
}
