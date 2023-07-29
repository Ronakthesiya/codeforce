import java.util.*;

class cn{
    int r,i;

    public void setr(int r){
        this.r=r;
    }
    public void seti(int i){
        this.i=i;
    }
    public void geti(){
        System.out.print(this.i+"i");
    }
    public void getr(){
        System.out.print(this.r+" + ");
    }
    public void sum(cn c2){
        this.r+=c2.r;
        this.i+=c2.i;
    }
}

public class demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        cn c1=new cn();
        cn c2=new cn();

        System.out.print("enter i and r : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        c1.setr(a);
        c1.seti(b);

        System.out.print("enter i and r : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c2.setr(a);
        c2.seti(b);

        c1.sum(c2);

        c1.getr();
        c1.geti();
    }
}