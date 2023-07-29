import java.util.*;
public class Garland {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        int arr[]=new int[4];
        

        while(t-->0){
            int n=sc.nextInt();
            arr[0]=0;
            arr[1]=0;
            arr[2]=0;
            arr[3]=0;
            int c=0;
            if(n==0){
                c=-1;
            }
            for(int i=0;n>0;i++){
                arr[i]=n%10;
                n=n/10;
            }

            if(c==-1){
                System.out.println("-1");
            }else
            if(arr[0]==arr[1] && arr[2]==arr[3] && arr[0]==arr[2]){
                System.out.println("-1");
            }else if((arr[0]==arr[1] && arr[0]==arr[2] && arr[0]!=arr[3]) || 
            (arr[1]==arr[2] && arr[1]==arr[3] && arr[1]!=arr[0]) || 
            (arr[2]==arr[3] && arr[2]==arr[0] && arr[2]!=arr[1]) || 
            (arr[3]==arr[0] && arr[3]==arr[1] && arr[3]!=arr[2])){
                System.out.println("6");
            }else{ 
                System.out.println("4");
            }
          
        }
    }
}
