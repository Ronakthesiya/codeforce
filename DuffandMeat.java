import java.util.*; 
public class DuffandMeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        int a[]=new int[t];
        int b[]=new int[t];

        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        int min=b[0];
        int sum=0;

        for(int i=0;i<t;i++){
            if(min>b[i]){
                min=b[i];
            }
            sum+=(min*a[i]);
        }

        System.out.println(sum);
    }
}
