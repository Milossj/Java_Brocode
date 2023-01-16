import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ffst implements ActionListener{
     static int ButtonCount = 16;

    public static void main(String[] args) {


        //frame
        JFrame frame = new JFrame("Task one");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        //close button
        JButton button1 = new JButton("Close");
        button1.setPreferredSize(new Dimension(200,200));

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        //number button
        JButton button2 = new JButton(String.valueOf(ButtonCount));
        button2.setPreferredSize(new Dimension(200,200));


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ButtonCount>1){
                    ButtonCount /= 2;
                    button2.setText(String.valueOf(ButtonCount));

                }
            }
        });


        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}



