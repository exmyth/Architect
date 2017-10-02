package com.exmyth.beyond.jdk8;

import javax.swing.*;

/**
 * Created by exmyth on 17/10/2.
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");

        /*
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed!");
                System.out.println("hello world");
                System.out.println("executed");
            }
        });
        */

        //类型推断
        jButton.addActionListener(event -> {
            System.out.println("Button Pressed!");
            System.out.println("hello world");
            System.out.println("executed");
        });



        jframe.add(jButton);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
