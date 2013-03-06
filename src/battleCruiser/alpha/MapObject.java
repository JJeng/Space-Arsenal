/**
 * 
 */
package battleCruiser.alpha;

/**
 * @author Jeff
 * 	allows any object that implements this interface to 
 *  be used by the games engine to be displayed on the map
 */
public interface MapObject {
	//must provide a location to put on the map.
	public Location getLocation();
	public void setLocation(Location l);
	public View getView();
	public boolean isAttackable();
	
}
