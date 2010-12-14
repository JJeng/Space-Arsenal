package battleCruiser.alpha;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenu extends JPanel{
	JButton newGame;
	JButton loadGame;
	JButton multiplayer;
	public MainMenu(){
		newGame = new JButton("New");
		loadGame = new JButton("Load");
		multiplayer = new JButton("Multiplayer");
		this.setLayout(new BorderLayout());
		this.add(newGame,BorderLayout.CENTER);
		this.add(loadGame,BorderLayout.CENTER);
		this.add(multiplayer,BorderLayout.CENTER);
		this.add(new JTextField("Battle Cruiser"),BorderLayout.NORTH);
	}

}
