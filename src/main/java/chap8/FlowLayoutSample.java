package chap8;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Novikov Dmitry
 */
public class FlowLayoutSample extends JFrame{

    public FlowLayoutSample(){
        super("FlowLayoutSample");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        c.add(new JButton("One"));
        c.add(new JButton("Two"));
        c.add(new JButton("Three"));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FlowLayoutSample();
    }
    
}
