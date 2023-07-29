import java.util.*;
public class LuoTianyiandtheShow {
    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){
        ArrayList<Integer> newl=new ArrayList<Integer>();

        for(Integer element : list){
            if(!newl.contains(element)){
                newl.add(element);
            }
        }
        return newl;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int c1=0,c2=0;
            int ans=0;

            int arr[]=new int[n];
            ArrayList<Integer> al=new ArrayList<Integer>();
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==-1){
                    c1++;
                }
                if(arr[i]==-2){
                    c2++;
                }
                if(arr[i]>0){
                    al.add(arr[i]);
                }
            }

            al=removeDup(al);
            int c3=al.size();
            int ans3=0,ans4=0;
            if(c1==0){
                if(c3+c2<=m){
                    ans3=c3+c2;
                }else{
                    ans3=m;
                }
                ans=ans3;
            }else if(c2==0){
                if(c3+c1<=m){
                    ans4=c3+c1;
                }else{
                    ans4=m;
                }
                ans=ans4;
            }else if(c1==0 && c2==0){
                ans=(ans3>=ans4)?ans3:ans4;
            }else{

                int max=(c1>=c2)?c1:c2;
                int ans1=0,ans2=0;
                if(max==c1){
                    int k=m-c1;
                    if(k<0){
                        ans1=m;
                    }else{
                        ans1=c1;
                        for(int i=0;i<c3;i++){
                            if(al.get(i)<k){
                                ans1++;
                            }
                        }
                    }
                    ans=ans1;
                }
                if(max==c2){
                    int k=c2;
                    if(k>m){
                        ans2=m;
                    }else{
                        ans2=c2;
                        for(int i=0;i<c3;i++){
                            if(al.get(i)>k){
                                ans2++;
                            }
                        }
                    }
                    ans=ans2;
                }
                
                if(c1==c2){
                    ans=(ans1>=ans2)?ans1:ans2;
                }
            }
            int ansx=c3;

            if(c3>0){
                int max=Collections.max(al);
                int min=Collections.min(al);
                
                if((min-1)>0){
                    if(min-1 >= c1){
                        ansx=c1+ansx;
                    }else{
                        ansx=ansx+min-1;
                    }
                }

                if(m-max>0){
                    if(m-max>=c2){
                        ansx=ansx+c2;
                    }else{
                        ansx=ansx+(m-max);
                    }
                }
            }

            ans=(ans>=ansx)?ans:ansx;

            System.out.println(ans);
        }
    }
}
