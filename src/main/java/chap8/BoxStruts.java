/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap8;

import javax.swing.*;

// используек наш новый класс
public class BoxStruts extends JFrame {

    public BoxStruts() {
        super("BoxStruts");
        setSize(250, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
// панель с вертикальный блочный расположением
        Box p = Box.createVerticalBox();
        p.add(new JButton("Один"));
// создание вертикальной распорки
        p.add(Box.createVerticalStrut(15));
// новый компонент и распорка другого размера
        p.add(new JButton("Два"));
        p.add(Box.createVerticalStrut(5));
        p.add(new JButton("Три"));
// панель с горизонтальный блочный расположением
        Box p2 = Box.createHorizontalBox();
// распорки можно ставить и перед компонентами
        p2.add(Box.createHorizontalStrut(10));
        p2.add(new JButton("Один"));
// создание горизонтальной распорки
        p2.add(Box.createHorizontalStrut(25));
        p2.add(new JButton("Два"));
        // добавляем панели на север и юг окна
        getContentPane().add(p, "North");
        getContentPane().add(p2, "South");
// выводим окно на экран
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxStruts();
    }
}
