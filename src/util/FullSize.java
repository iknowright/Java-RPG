// Make frame full screen and set it visible
package util;

import javax.swing.JFrame;

public class FullSize {
	
	public static void fullScreen(JFrame frame) {
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
