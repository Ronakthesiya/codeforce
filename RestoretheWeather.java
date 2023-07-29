import java.util.*;
public class RestoretheWeather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                c[i]=a[i];
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }

                    if(b[i]>b[j]){
                        int temp=b[j];
                        b[j]=b[i];
                        b[i]=temp;
                    }
                }
            }

            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(a[j]==c[i]){
                        int temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;

                        System.out.print(b[j]+" ");

                        temp=b[j];
                        b[j]=b[i];
                        b[i]=temp;

                        break;
                        
                    }
                }
            }
            System.out.println();
        }
    }
}
