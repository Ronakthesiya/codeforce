import java.util.*;
public class MakeThemEqual {
    public static boolean chack(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c){
                return false;
            }
        }
        return true;
    }
    public  static int prime(int k){
        int f=1;
        while(1==1){
            k++;
            f=1;
            for(int i=2;i<k/2;i++){
                if(k%i==0){
                    f=0;
                }
            }
            if(f==1){
                return k;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            char c=sc.next().charAt(0);

            sc.nextLine();
            String s=sc.nextLine();

            if(chack(s,c)){
                System.out.println(0);
            }else{
                ArrayList<Integer> al=new ArrayList<Integer>();
                int k=2;
                int ans=1;
                while(1==1){
                    al.add(k);
                    for(int i=0;i<n;i++){
                        if((i+1)%k!=0){
                            String q=s.substring(0,i)+c+s.substring(i+1,n);
                            s=q;
                        }
                    }
                    if(chack(s,c)){
                        break;
                    }else{
                        k=prime(k);
                        ans++;
                    }
                    if(k>n){
                        break;
                    }
                }

                System.out.println(ans);
                for(int i=0;i<al.size();i++){
                    System.out.print(al.get(i)+" ");
                }
                System.out.println();
            }
        }
    }
}
