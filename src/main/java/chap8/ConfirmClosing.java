package chap8;

import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Novikov Dmitry
 */
public class ConfirmClosing extends JFrame{
    
    public ConfirmClosing() {
        super("ConfirmClosing");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int res = JOptionPane.showConfirmDialog(null, "Действительнов выйти?");
                if (res == JOptionPane.YES_OPTION) System.exit(0);
            }
        });
        
        setSize(200, 100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ConfirmClosing();
    }
}
