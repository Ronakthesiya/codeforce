import java.util.*;
public class Factory {
    public static boolean chack(int a,int m){
        while(m%2==0){
            m=m/2;
            if(a%m==0){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int m=sc.nextInt();

        if(a%m==0){
            System.out.println("Yes");
        }else{
            if(chack(a,m)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
