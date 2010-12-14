package battleCruiser.alpha;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainMenu extends JPanel {
	JButton newGame;
	JButton loadGame;
	JButton multiplayer;
	JButton quit;
	public MainMenu(){
		newGame = new JButton("New");
		newGame.setName("New");
		newGame.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//TODO: Create New Character
				//TODO: Load Relevant Game Data
				//TODO: 
			}
		});
		loadGame = new JButton("Load");
		loadGame.setName("Load");
		multiplayer = new JButton("Multiplayer");
		multiplayer.setName("multi");
		quit = new JButton("Quit");
		quit.setName("quit");
		this.setLayout(new BorderLayout());
		this.add(newGame,BorderLayout.CENTER);
		this.add(loadGame,BorderLayout.CENTER);
		this.add(multiplayer,BorderLayout.CENTER);
		this.add(quit,BorderLayout.CENTER);
		this.add(new JTextField("Battle Cruiser"),BorderLayout.NORTH);
	}
}
