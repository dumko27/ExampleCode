/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap8;

import javax.swing.*;
import java.awt.event.*;
// Класс главного окна

public class Adapters extends JFrame {

    Adapters() {
        super("Adapters");
setDefaultCloseOperation(EXIT_ON_CLOSE); // При закрытии окна - выход
        addMouseListener(new MouseL()); // Регистрация слушателя
        setSize(200, 200); // Задаем размеры окна
        setVisible(true); // и показываем его
    }

    public static void main(String[] args) {
        new Adapters();
    }
}
// Слушатель событий

class MouseL extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
        System.out.println(e);
    }
}
