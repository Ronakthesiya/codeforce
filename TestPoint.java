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

class Point3D extends Point2D{
	private int z;

	void setZ(int z){
		this.z=z;
	}

	int getZ(){
		return z;
	}

	double getDistance(Point3D p){
		return Math.sqrt(((p.getX()-this.getX())*(p.getX()-this.getX()))+((p.getY()-this.getY())*(p.getY()-this.getY()))+((p.getZ()-this.getZ())*(p.getZ()-this.getZ())));
	}

}




public class TestPoint{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Point3D p1=new Point3D();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		p1.setX(x);
		p1.setY(y);
		p1.setZ(z);
		//System.out.println(p1.getX());

		Point3D p2=new Point3D();
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		p2.setX(x);
		p2.setY(y);
		p2.setZ(z);
		System.out.println(p1.getDistance(p2));
		//double ans=p1.getDistance(p2);

	}
}