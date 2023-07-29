import java.util.*;
public class DimaandLisa {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        int f=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                f=0;
                break;
            }
        }
        if(f==1){
            return true;
        }else{
            return false;
        }
    } 
    public static int minprime(int n){
        if(isprime(n)){
            return n;
        }
        minprime((n--));

        return 0;
    } 
    public static ArrayList<Integer> al=new ArrayList<>();
    public static ArrayList<Integer> chack(int n){
        if(n<=0){
            return al;
        }
        al.add(minprime(n));
        int s=al.size();
        int k=n-al.get(s-1); 
        chack(k); 
        return al;              
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        chack(n);

        int s=al.size();
        System.out.println(s);
        for(int i=0;i<s;i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
