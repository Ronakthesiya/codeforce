


import java.util.*;
public class GoldRush {
    public static ArrayList<Integer> al=new ArrayList<>();
    public static void chack(int n){
        al.add(n);
        if(n%3!=0){
            return;
        }
        
        chack(2*n/3);
        
        chack(n/3);
        

        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                
        int t=sc.nextInt();
                
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            
            chack(n);

            if(al.contains(k)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            al.clear();
        }
    }
}
