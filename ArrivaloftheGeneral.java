import java.util.*;
public class ArrivaloftheGeneral {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        int min=arr[0],max=arr[0],minind=0,maxind=0;

        for(int i=0;i<a;i++){
            if(max<arr[i]){
                max=arr[i];
                maxind=i;
            }
        }

        for(int i=0;i<a;i++){
            if(min>=arr[i]){
                min=arr[i];
                minind=i;
            }
        }

        int k=a-minind+maxind;

        if(minind<maxind){
            k--;
        }
        k--;


        System.out.print(k);
    }
}
