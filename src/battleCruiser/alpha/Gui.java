package battleCruiser.alpha;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame{
	JPanel view;
	public Gui(String programTitle){
		super(programTitle);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,600);
		//this.setLayout(new BorderLayout());
		setView( new MainMenu());
		this.setVisible(true);
	}
	public void setView(JPanel view){
		if(this.view != null){
			this.remove(view);
			
		}
		this.view = view;
		this.add(view);
	}
	
}
