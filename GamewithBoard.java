import java.util.*;
public class GamewithBoard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            char ans='B';
            
            if(n>4){
                ans='A';
            }

            if(ans=='A'){
                System.out.println("Alice");
            }else{
                System.out.println("Bob");
            }
        }
    }
}
