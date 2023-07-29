import java.util.*;

public class BlackSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=arr[s.charAt(i)-49];
        }

        System.out.println(sum);
    }
}