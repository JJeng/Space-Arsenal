package battleCruiser.alpha;
import javax.swing.*;
/**
 * Alpha
 * BattleCruiser Alpha
 * 
 * main init class
 * @author Jeff
 */
public class Alpha {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4232015141048999640L;
	Gui mainWindow;
	SoundEngine se;
	public Alpha(){
		//Init Gui
		mainWindow = new Gui("Battle Cruiser Alpha .01");
		//Gui is online
		//Init Sound thread and store handle
		se = new SoundEngine();
	}
    public static void main(String sa[]){
    	new Alpha();
    	
    }
}