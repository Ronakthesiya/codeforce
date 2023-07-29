import java.util.*;
public class Drinks {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        double b=0.0;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            b=b+(arr[i]/100.00);
        }

        b=(b/n)*100;

        System.out.println(b);
    }
}
