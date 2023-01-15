import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class ButtonExample {

        private static int count = 0;
        private static JLabel label;
        public static void main(String[] args) {
            JFrame frame = new JFrame("Button Example");
            JButton button = new JButton("0");
            label = new JLabel("0");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    count++;
                    label.setText(Integer.toString(count));
                    button.setText(Integer.toString(count));
                }
            });
            frame.setLayout(new FlowLayout());
            frame.add(button);
            frame.add(label);
            frame.setSize(200,200);
            frame.setVisible(true);
        }
    }
