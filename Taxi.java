import java.util.*;
public class Taxi {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int n1=0,n2=0,n3=0,n4=0,sum=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==4){
                n4++;
            }else if(arr[i]==3){
                n3++;
            }else if(arr[i]==2){
                n2++;
            }else if(arr[i]==1){
                n1++;
            }
        }
        
        if(n3>=n1){
            n1=0;
        }else if(n3<n1){
            n1=n1-n3;
        }
        sum=sum+(n1/4)+n3+n4+(n2/2);

        n2=n2-2*(n2/2);
        n1=n1-4*(n1/4);

        if(n2!=0 || n1!=0){
            sum++;
        }
        if(n2==1 && n1==3){
            sum++;
        }

        System.out.println(sum);
    }
}
