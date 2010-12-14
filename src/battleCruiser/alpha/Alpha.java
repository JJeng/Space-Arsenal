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
	//private GLSurfaceView mainView;
	public Alpha(){
		//Init Gui
		mainWindow = new Gui("Battle Cruiser Alpha .01");
		
	}
    public static void main(String sa[]){
    	new Alpha();
    	
    }
}