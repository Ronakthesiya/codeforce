import java.util.*;
public class MediumNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=1;i<=t;i++){
            int arr[]=new int[3];
            
            for(int j=0;j<3;j++){
                arr[j]=sc.nextInt();
            }
            
            for(int j=0;j<2;j++){
                for(int k=0;k<2-j;k++){
                    if(arr[k]>arr[k+1]){
                        int temp=arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                    }
                }
            }

            System.out.println(arr[1]);

        }
    }
}
