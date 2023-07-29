import java.util.*;
public class DivisibilitybyEight
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        if(st.contains("0"))
            System.out.println("YES"+"\n"+'0');
        else
        {
            int f=1;
            for(int i=8;i<1000;i+=8)
            {
                f=1;
                int n=i;
                int p=st.length()-1;
                while(n>0)
                {
                    int d=n%10;
                    p=st.lastIndexOf(Integer.toString(d),p);
                    if(p==-1)
                    {
                        f=0;
                        break;
                    }
                    p--;
                    n=n/10;
                }
                if(f==1)
                {
                    System.out.println("YES"+"\n"+i);
                    break;
                }
            }
            if(f==0)
                System.out.println("NO");
        }
    }
}