import java.util.*;

class cm{
    int r,i;
    public void setr(int r){
        this.r=r;
    }
    public void seti(int i){
        this.i=i;
    }
    public void sum(cm c2){
        this.r+=c2.r;
        this.i+=c2.i;
    }
    public void getr(){
        System.out.print(this.r+" + ");
    }
    public void geti(){
        System.out.print(this.i+"i");
    }
} 

public class complex{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        cm c1=new cm();
        System.out.println("enter real and imagnary part : ");
        int r=sc.nextInt();
        int i=sc.nextInt();
        c1.seti(i);
        c1.setr(r);

        cm c2=new cm();
        System.out.println("enter real and imagnary part : ");
        r=sc.nextInt();
        i=sc.nextInt();
        c2.seti(i);
        c2.setr(r);

        c1.sum(c2);
        c1.getr();
        c1.geti();
    }
}