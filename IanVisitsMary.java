import java.util.*;
public class IanVisitsMary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();

            if((x%y!=0 && y%x!=0) || (x==1 && y==1)){
                System.out.println(1);
                System.out.println(x+" "+y);
            }else if(x==y){
                x++;
                if((x%y!=0 && y%x!=0) || (x==1 && y==1)){
                    System.out.println(2);
                    System.out.println(x+" "+y);
                    x--;
                    System.out.println(x+" "+y);
                }else{
                    y++;
                    if((x%y!=0 && y%x!=0) || (x==1 && y==1)){
                        System.out.println(2);
                        System.out.println(x+" "+y);
                        y--;
                        System.out.println(x+" "+y);
                    }
                }
            }
        }
    }
}
