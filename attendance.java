import java.util.*;
public class attendance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int start,end,a=0,p=0;
        char k;

        System.out.println("enter start and end of number : ");
        start=s.nextInt();
        end=s.nextInt();

        int pre[]=new int[end-start];
        int abs[]=new int[end-start];

        System.out.println("            \n enter 'A'=Absent or 'P'=Present \n");

        for(int i=start; i<=end; i++){
            System.out.print("\u000C");
            System.out.print("student "+i+" : ");

            k=s.next().charAt(0);
            if(k=='A' || k=='a'){
                a++;
                abs[a-1]=i;
            }else if(k=='P' || k=='p'){
                p++;
                pre[p-1]=i;
            }else{
                System.out.println("enter a vailid input.");
                i=i-1;
            }
        }

        System.out.print("\n\nAbsent No : ");
        for(int i=0; i<a; i++){
            System.out.print(abs[i]+",");
        }
        System.out.print("\nPresent No : ");
        for(int i=0; i<p; i++){
            System.out.print(pre[i]+",");
        }

        System.out.println("\n\n            total Present   : "+p);
        System.out.println("            total Absent    : "+a+"\n\n");

    }
}
