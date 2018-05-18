import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class GameFrame extends JFrame implements KeyListener {
    public static void main(String[] args) {
        GameFrame gameframe = new GameFrame();
        gameframe.setVisible(true);
    }

    public GameFrame() {
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        JButton btnClose = new JButton("Exit");

        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(btnClose, BorderLayout.CENTER);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            System.out.println( KeyEvent.VK_W);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            System.out.println( KeyEvent.VK_S);
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            System.out.println( KeyEvent.VK_A);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            System.out.println( KeyEvent.VK_D);
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {

    }
}