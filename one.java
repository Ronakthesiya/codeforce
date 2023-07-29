import java.util.*;
class Point2D{
	private int x;
	private int y;

	void setX(int x){
		this.x=x;
	}
	int getX(){
		return x;
	}

	void setY(int y){
		this.y=y;
	}
	int getY(){
		return y;
	}

	double getDistance(Point2D p){
		return Math.sqrt(((p.x-x)*(p.x-x))+((p.y-y)*(p.y-y)));
	}
}

class p3d extends Point2D{
	private int z;

	void setz(int z){
		this.z=z;
	}
	int getz(){
		return z;
	}

	double getDistance(Point2D p,Point2D p1,p3d p2){
		return Math.sqrt(((p.getX()-p1.getX())*(p.getX()-p1.getX()))+((p.getY()-p1.getY())*(p.getY()-p1.getY()))+((p2.z-z)*(p2.z-z)));	
	}
}


public class one{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point2D p1=new Point2D();
		int x=sc.nextInt();
		int y=sc.nextInt();
		p1.setX(x);
		p1.setY(y);
        p3d p3=new p3d();
		p3.setz(sc.nextInt());
		

		Point2D p2=new Point2D();
		x=sc.nextInt();
		y=sc.nextInt();
		p2.setX(x);
		p2.setY(y);

		p3d p4=new p3d();
		p4.setz(sc.nextInt());


		System.out.println(p4.getDistance(p1,p2,p3));
		//double ans=p1.getDistance(p2);

	}
}