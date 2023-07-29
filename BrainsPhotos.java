import java.util.*;
public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        char arr[][]=new char[n][m];
        int f=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.next().charAt(0);

                if(arr[i][j]=='W' || arr[i][j]=='G' || arr[i][j]=='B'){

                }else{
                    f=0;
                }
            }
        }

        if(f==0){
            System.out.println("#Color");
        }else{
            System.out.println("#Black&White");
        }
    }
}
