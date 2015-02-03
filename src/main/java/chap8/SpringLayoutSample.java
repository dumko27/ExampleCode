package chap8;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Novikov Dmitry
 */
public class SpringLayoutSample extends JFrame {
    
    private JButton button1, button2;
    
    public SpringLayoutSample() {
        super("SpringLayoutSample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        SpringLayout s1 = new SpringLayout();
        JPanel contents = new JPanel(s1);
        contents.add(button1 = new JButton("First"));
        contents.add(button2 = new JButton("Second"));
        
        s1.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, contents);
        s1.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.EAST, button1);
        
        setContentPane(contents);
        setSize(300, 200);
        
        setVisible(true);
    }

    
    public static void main(String[] args) {
        new SpringLayoutSample();
    }
    
}
