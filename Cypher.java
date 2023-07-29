import java.util.*;
public class Cypher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();

            int a[]=new int[n];

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            sc.nextLine();
            for(int i=0;i<n;i++){
                String m=sc.nextLine();
                for(int j=0;j<m.length();j++){
                    if(m.charAt(j)=='D'){
                        a[i]++;
                        if(a[i]>9){
                            a[i]-=10;
                        }
                    }
                    if(m.charAt(j)=='U'){
                        a[i]--;
                        if(a[i]<0){
                            a[i]+=10;
                        }
                    }
                }
            }

            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}
