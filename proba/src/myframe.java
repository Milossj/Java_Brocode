import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame /*implements ActionListener*/{
    JButton button = new JButton();


    JLabel label = new JLabel();
    MyFrame(){

        ImageIcon icon = new ImageIcon("download.png");
        JButton button = new JButton();
        button.setBounds(200,100,250,150);
        //button.addActionListener(this);
        button.addActionListener(e -> System.out.println("poo")); //lambda expression
        button.setText("Button");
        button.setFocusable(false);
        button.setForeground(Color.cyan);
        button.setBackground(Color.black);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
  /*  @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){
            System.out.print("finally");
        }*/


    }
