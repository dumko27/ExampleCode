package chap8;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Novikov Dmitry
 */
public class GridLayout1 extends JFrame{
    
    public GridLayout1() {
        super("GridLayout1");
        setSize(300, 200);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel grid = new JPanel();
        
        GridLayout g1 = new GridLayout(2, 0, 5, 12);
        grid.setLayout(g1);
        for(int i=0; i < 8; i++) {
            grid.add(new JButton("Button " + i));
        }
        getContentPane().add(grid);
        
        setVisible(true);;
    }
    
    public static void main(String[] args) {
        new GridLayout1();
    }
}
