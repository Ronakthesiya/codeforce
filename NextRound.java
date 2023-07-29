import java.util.*;
public class NextRound {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int w=0;
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<a;i++){
                if(arr[i]>=arr[b-1] && arr[i]!=0){
                    w++;
                }
        }
        System.out.println(w);
    }
}
