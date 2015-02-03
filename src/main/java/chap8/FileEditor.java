/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap8;

import javax.swing.*;

public class FileEditor extends JFrame {

    private JTextArea dataField;
    private String fileName;

    public FileEditor(String fileName) {
        super();
        this.fileName = fileName;
        dataField = new JTextArea(40, 20);
// ... some other initialisation
        Thread dataLoader = new Thread(new FileLoader());
        dataLoader.start();
    }

    private class FileLoader implements Runnable {

        public void run() {
            final StringBuffer content = new StringBuffer();
//... loading file data here into buffer
            if (SwingUtilities.isEventDispatchThread()) {
                dataField.setText(content.toString());
            } else {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        dataField.setText(content.toString());
                    }
                });
            }
        }
    }
    
    public static void main(String[] args) {
        new FileEditor("Op");
    }
}
