import java.util.*;
public class FindandReplace {
    public static void check(String s,int n){
        

        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int flag=0;
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                for(int j=i;j<n;j++){
                    char d=s.charAt(j);
                    if(c==d){
                        if((i-j)%2!=0){
                           flag=1;
                           break;
                        }
                    }
                }
            }
            if(flag==1){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
        }
    }
}
