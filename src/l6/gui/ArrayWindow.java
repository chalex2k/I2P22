package l6.gui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.OptionalInt;

public class ArrayWindow extends JFrame {
    private JPanel rootPanel;
    private JTextField arrayTextField;
    private JTextField resultTextField;
    private JButton button;

    public ArrayWindow() {
        setContentPane(rootPanel);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String arrayText = arrayTextField.getText();
                int max = Logic.findMax(Logic.stringToIntArray(arrayText));
                resultTextField.setText(Integer.toString(max));
            }
        });
    }
    public static void main(String[] args) {
        ArrayWindow w = new ArrayWindow();
        w.setSize(800, 500);
    }
}