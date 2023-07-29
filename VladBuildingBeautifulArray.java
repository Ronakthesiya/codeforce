import java.util.*;

public class VladBuildingBeautifulArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int ce=0,co=0;
            int mino=1000000000,mine=1000000000;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0){
                    ce++;
                    if(mine>a[i]){
                        mine=a[i];
                    }
                }else{
                    co++;
                    if(mino>a[i]){
                        mino=a[i];
                    }
                }
            }

            if(ce==0 || co==0){
                System.out.println("YES");
            }else{
                int f=1;
                for(int i=0;i<n;i++){
                    if(a[i]-mino<0){
                        f=0;
                        System.out.println("NO");
                        break;
                    }
                }
                if(f==1){
                    System.out.println("YES");
                }
            }
        }
    }
}