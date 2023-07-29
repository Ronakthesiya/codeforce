import java.util.*;

public class HelpfulMaths{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.nextLine();
        int b=a.length();
        b=b-(b/2);
        int arr[]=new int[b];
        int k=0;
        for(int i=0;i<a.length();i=i+2){
            int c=i+1;
            arr[k]=Integer.parseInt(a.substring(i, c));
            k++;
            if(k>=b){
                break;
            }
        }

        for(int i=0;i<b-1;i++){
            for(int j=0;j<b-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String m="";
        for(int i=0;i<b;i++){
            m=m+(arr[i]+"");
            if(i!=(b-1)){
                m=m+"+";
            }
        }

        System.out.println(m);
    }
}