package battleCruiser.alpha;

import java.awt.BorderLayout;

import javax.swing.JPanel;
/**
 * Character creation engine
 * @author Jeff
 *
 */
public class CharCreation extends JPanel{
	public CharCreation(){
		this.setLayout(new BorderLayout());
		
	}
	/**
	 * 
	 * @param server what server to send it to
	 * @return boolean to say if the character was sent successfully
	 */
	public boolean sendCharacter(Server server){
	}
	/**
	 * Retrieve 
	 * @return
	 */
	public Character[] retrieveCharacter(Server server){
		return null;
	}
}
