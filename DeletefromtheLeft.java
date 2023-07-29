import java.util.*;
public class DeletefromtheLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        int as=a.length();
        String b=sc.nextLine();
        int bs=b.length();
        
        int i=as-1;
        int j=bs-1;
        int sum=0;

        if(a==b){
            System.out.println(0);
        }
        else{
        while(true){
            i=as-1-sum;
            j=as-1-sum;
            if(i>=0 && j>=0 && b.charAt(j)==a.charAt(i)){
                sum+=1;
            }else{
                break;
            }
        }

        System.out.println(bs+as-(2*sum));
    }
    }
}
