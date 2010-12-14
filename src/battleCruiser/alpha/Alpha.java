package battleCruiser.alpha;

import javax.swing.*;
public class Alpha extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4232015141048999640L;

	//private GLSurfaceView mainView;
	public Alpha(){
		super("Testing");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200,200);
		this.setVisible(true);
	}
    public static void main(String sa[]){
    	new Alpha();
    	
    }
}