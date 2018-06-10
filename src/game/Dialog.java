package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dialog {
	
	private JLabel textbox;public JPanel panel;
	private int height=200;
	
	// change position
	public Dialog(){
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(0, height));
		panel.setBackground(Color.yellow);
		textbox = new JLabel("Hi, I am NPC!",JLabel.LEFT);
		panel.add(textbox);
		
		//textbox.setText("Hi, I am NPC!");
		//textbox.setMinimumSize(new Dimension(width, height));
		//textbox.setPreferredSize();
		//textbox.setMaximumSize(new Dimension(width, height));		
	}
	
	// show
	public void showDialog(String msg) {
		textbox.setText(msg);
	}
	
	// hide
	public void hideDialog() {
		
	}
		
}
