package util;
import javax.swing.*;

public class FullSize{

  public static void fullSize(JFrame frame){
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    frame.setUndecorated(true);
    frame.setVisible(true);
  }

}