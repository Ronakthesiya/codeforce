import java.util.*;
public class OddQueries {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);

        int t=get.nextInt();

        while(t-->0){
                int n = get.nextInt();
                int q = get.nextInt();
                int[] aray = new int[n+1];
                int[] arr = new int[n];
                
                for(int j=0;j<n;j++){
                    arr[j] = get.nextInt();
                    if(j==0) aray[j+1]=arr[j];
                    else aray[j+1]=arr[j]+aray[j];
                }
                while(q-->0){
                    int l = get.nextInt();
                    int r = get.nextInt();
                    int k = get.nextInt();
                    int sum=0;
                    sum = aray[n]-aray[r]+aray[l-1]+(k*(r-l+1));

                    if((sum%2)!=0){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }

