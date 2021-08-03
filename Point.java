package lab6_1302;

public class Point implements Comparable<Point>{
	public float x;
	public float y;
	public float z;
	
	public Point  (int inX, int inY, int inZ) {
		x = inX;
		y = inY;
		z = inZ;
	}
	public int compareTo(Point p) {
		if(this.x <p.x|| this.x>p.x) {
			return (int) Math.abs(this.x-p.x);
			
		}else if(this.y <p.y|| this.y>p.y) {
			return (int) Math.abs(this.y-p.y);
		}else if(this.z<p.z || this.z>p.z) {
			return (int) Math.abs(this.z-p.z);
			
		}else {
			return (int) Math.abs(this.z-p.z);
		}
	}
}
