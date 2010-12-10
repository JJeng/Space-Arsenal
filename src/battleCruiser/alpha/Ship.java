package battleCruiser.alpha;

public class Ship implements MapObject{
	int maxArmor;
	int maxShield;
	Item items[];
	Path path;
	View shipView;
	Attack attacks[];
	Location target;
	Location location;
	MapObject lock;
	@Override
	public Location getLocation() {
		return location;
	}
	@Override
	public View getView() {
		return shipView;
	}
	@Override
	public boolean isAttackable() {
		return true;
	}
	@Override
	public void setLocation(Location l) {
		// TODO Auto-generated method stub
		
	}

}
