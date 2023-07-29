import java.util.*;
public class IsItaCat {
    static void check(int a,String b){

        b=b.toUpperCase(); 
            
        if(b.charAt(0)!='M'){
            System.out.println("NO");
            return ;
        }
        if(b.charAt(a-1)!='W'){
            System.out.println("NO");
            return ;
        }
        for(int j=0;j<a;j++){
            if(b.charAt(j)=='M' || b.charAt(j)=='E' || b.charAt(j)=='O' || b.charAt(j)=='W'){
            
            }else{
                System.out.println("NO");
                return;
            }
        }
        char curcar[]={'M','E','O','W'};
        int k=0;
        for(int j=0;j<a-1;j++){
            if(curcar[k]==b.charAt(j) && curcar[k]!=b.charAt(j+1)){
                if(curcar[k+1]!=b.charAt(j+1)){
                    System.out.println("NO");
                    return ;
                }
                k++;
            }                
        }       
        System.out.println("YES");
        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        

        for(int i=1;i<=t;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();

            check(a,b);
        }
    }
}
