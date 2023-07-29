import java.util.*;
public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        int arr[]=new int[t];
        ArrayList<Integer> al=new ArrayList<Integer>();
        int c=1;
        al.add(c);
        
        for(int i=0;i<t;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<t-1;i++){
            if(arr[i]<arr[i+1]){
                c++;
                al.add(c);
            }else{
                c=1;
            }
        }

        System.out.println(Collections.max(al));
        
    }
}


