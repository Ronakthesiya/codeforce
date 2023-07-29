import java.util.*;
public class FedyaandMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        int m=s.length();
        int n=0;
        if(m>=3){
            int k=s.charAt(m-1);
            int l=s.charAt(m-2);
            int o=s.charAt(m-3);
            n=(o*100)+(l*10)+k;
        }else if(m==2){
            int k=s.charAt(m-1);
            int l=s.charAt(m-2);
            n=(l*10)+k;
        }else{
            int l=s.charAt(m-1);
            n=l;
        }
        int sum=1;

        if(n%4==0){
            sum=sum+6+1;
        }else if(n%4==1){
            sum=sum+2+3;
        }else if(n%4==2){
            sum=sum+4+9;
        }else if(n%4==3){
            sum=sum+8+7;
        }

        if(n%2==0){
            sum=sum+6;
        }else if(n%2==1){
            sum=sum+4;
        }

        System.out.println(sum%5);
    }
}
