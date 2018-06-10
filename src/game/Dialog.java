/** 
 * This class adds the dialog pop up dialog layer into the game.
 * To show a certain message, please use the showDialog() method, using a string(ur message)
 * as argument.
 * @version 1.0
 * @since   2018-06-10
 */

package game;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Dialog{
	
	private JLabel textbox; //the text to be shown
	private int height=200;
	private JLayeredPane frameLayers;
	
	// change position
	public Dialog(){
		System.out.println("Error! Please send a JLayeredPane to the Dialog class.");
//		panel = new JPanel();
//		panel.setPreferredSize(new Dimension(0, height));
//		panel.setBackground(Color.yellow);
//	    textbox = new JLabel("Hi, I am NPC!",JLabel.LEFT);
//		panel.add(textbox);
		//setPreferredSize(new Dimension(0, height));
		//JLabel label = createColoredLabel("Yellow (test)",Color.yellow, new Point(10, 20));
		//add(label, new Integer(4));
		//textbox.setText("Hi, I am NPC!");
		//textbox.setMinimumSize(new Dimension(width, height));
		//textbox.setPreferredSize();
		//textbox.setMaximumSize(new Dimension(width, height));		
	}
	
	public Dialog(JLayeredPane FL)
	{
		frameLayers = FL;
		//initialize the text box to show
		textbox = new JLabel("",JLabel.LEFT);
		textbox.setVerticalAlignment(JLabel.CENTER);
		textbox.setHorizontalAlignment(JLabel.CENTER);
		textbox.setBackground(Color.yellow);
		textbox.setForeground(Color.black);
		textbox.setOpaque(true);
		// set position and dimension
		textbox.setBounds(25, 780, 1250, 160);
		spawnDialog();
		hideDialog();
	}
	// show
	public void showDialog(String msg) {
		textbox.setVisible(true);
		textbox.setText(msg);
	}
	
	// hide
	public void hideDialog() {
		textbox.setVisible(false);
	}
	
	public void spawnDialog() {
		frameLayers.add(textbox, new Integer(2));
	}
}
