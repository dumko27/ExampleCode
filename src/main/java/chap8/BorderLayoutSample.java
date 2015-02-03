package chap8;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Novikov Dmitry
 */
public class BorderLayoutSample extends JFrame{
    
    public BorderLayoutSample(){
        super("BorderLayoutSample");
        setSize(400, 300);
        
        Container c = getContentPane();
        c.add(new JButton("Север"), "North");
        c.add(new JButton("Юг"), "South");
        
        c.add(new JLabel("Запад"), BorderLayout.WEST);
        c.add(new JLabel("Восток"), BorderLayout.EAST);
        
        c.add(new JButton("Центр"));
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new BorderLayoutSample();
    }
}
