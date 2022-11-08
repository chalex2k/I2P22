package l6.gui_manual_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocation(500, 400);
        frame.setTitle("Окно сделанное руками");

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Текст ... текст");
        label.setOpaque(true);
        panel.add(label);

        JButton button = new JButton("кнопка");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (label.getBackground() == Color.GREEN) {
                   label.setBackground(Color.RED);
                }
                else {
                    label.setBackground(Color.GREEN);
                }
            }
        });
        panel.add(button);
    }
}
