package battleCruiser.alpha;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

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
		
		JLabel title = new JLabel("Battle Cruiser");
		title.setHorizontalTextPosition(SwingConstants.CENTER);
		title.setVerticalTextPosition(SwingConstants.CENTER);
		this.setLayout(new GridLayout(5,1));
		this.add(title);
		this.add(newGame);
		this.add(loadGame);
		this.add(multiplayer);
		this.add(quit);
		
	}
}
