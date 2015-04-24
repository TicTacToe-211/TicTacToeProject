
public class Location implements Comparable<Location> {
	private int x;
	private int y;
	
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public int compareTo(Location otherLocation){
		if(this.x==otherLocation.getX() && this.y==otherLocation.getY()){
			return 0;
		}
		else return -1;
	}
	
	public String toString(){
		return x +", "+y;
	}
}
