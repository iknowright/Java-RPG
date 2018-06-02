package game;
/** 
 * This class represents a key on the keyboard.
 * It will record the basic status of the key, 
 * such as if it was pressed and the times being pressed.
 * 
 * @version 1.0
 * @since   2018-05-26
 */

public class Key{
	private boolean isPressed; //Status of the key
	private int timesPressed; //times of this key pressed
	
	public Key() {
		isPressed = false;
		timesPressed = 0;
	}
	
	public void setPressed(boolean bePressed)
	{
			isPressed = bePressed;
			if(isPressed)
			{
				timesPressed++;
			}
	}
	public boolean getPressed() {
		return isPressed;
	}
	public int getTimesPressed() {
		return timesPressed;
	}
}