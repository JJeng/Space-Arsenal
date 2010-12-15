package battleCruiser.alpha;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Gui extends JFrame{
	public Gui(String programTitle){
		super(programTitle);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setLayout(new BorderLayout());
		MainMenu mm = new MainMenu();
		this.add(mm);
		this.setVisible(true);
	}
	
	
}
