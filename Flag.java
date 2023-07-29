import java.util.*;
public class Flag {
    public static boolean removeduplicate(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                return false;
            }    
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int ans=1;
        String a[]=new String[n];

        for(int i=0;i<n;i++){
            a[i]=sc.next();
            
            if(i>=1){
                if(a[i].equals(a[i-1])){
                    ans=0;
                }
            }

            if(!removeduplicate(a[i])){
                ans=0;
            }
        }

        if(ans==0){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
