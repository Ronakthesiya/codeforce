import java.util.*;
public class MrPerfectlyFine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int arr[]=new int[n];
            int arr2[]=new int[n];
            int min1=1000000;
            int min2=min1;
            int min3=min1;
                       
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arr2[i]=sc.nextInt();

                if(arr2[i]==1){
                    if(arr[i]<min1){
                        min1=arr[i];
                    }
                }
                if(arr2[i]==10){
                    if(arr[i]<min2){
                        min2=arr[i];
                    }
                }
                if(arr2[i]==11){
                    if(arr[i]<min3){
                        min3=arr[i];
                    }
                }
            }

            if(min3==1000000){
                if((min1==1000000) || (min2==1000000)){
                    System.out.println(-1);
                }else{
                    System.out.println(min1+min2);
                }
            }else{
                int min=min1+min2;
                System.out.println((min>min3)?min3:min);
            }
        }
    }
}
