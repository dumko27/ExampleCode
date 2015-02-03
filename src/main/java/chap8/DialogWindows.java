package chap8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Novikov Dmitry
 */
public class DialogWindows extends JFrame {

    public DialogWindows() {
        super("DialogWindows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button1 = new JButton("Обычное окно");
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("Немодальное", false);
                dialog.setVisible(true);
            }
        });
        JButton button2 = new JButton("Модальное окно");
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = createDialog("Модальное", true);
                dialog.setVisible(true);
            }
        });

        JPanel contents = new JPanel();
        contents.add(button1);
        contents.add(button2);
        setContentPane(contents);
        setSize(350, 100);
        setVisible(true);
    }

    public JDialog createDialog(String title, boolean modal) {
        JDialog dialog = new JDialog(this, title, modal);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(200, 60);
        return dialog;
    }

    public static void main(String[] args) {
        new DialogWindows();
    }
}
