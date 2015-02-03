package chap8;

import javax.swing.*;

/**
 *
 * @author Novikov Dmitry
 */
public class FrameClosing extends JFrame {
    public FrameClosing() {
        super("Заголовок окна");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FrameClosing();
    }
}
