package battleCruiser.alpha;

//a point space
public class Location {
	private volatile float x,y,z;
	public Location(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public synchronized float getX() {
		return x;
	}
	public synchronized float getY() {
		return y;
	}
	public synchronized float getZ() {
		return z;
	}
	public synchronized void setX(float x) {
		this.x = x;
	}
	public synchronized void setY(float y) {
		this.y = y;
	}
	public synchronized void setZ(float z) {
		this.z = z;
	}
	public float distance(Location point2){
		return (float) (java.lang.Math.pow((point2.getX()-x),2) + 
				java.lang.Math.pow((point2.getY()-y),2)+
				java.lang.Math.pow((point2.getZ()-z),2));
	}
}
