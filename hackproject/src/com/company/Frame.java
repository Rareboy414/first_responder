package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.applet.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    JButton fire;
    JButton med;
    JButton police;
    public Frame(){
        fire = new JButton("Fire");
        med = new JButton("Medical");
        police = new JButton("Police");

        JFrame f = new JFrame();

        JPanel Panel1 = new JPanel();

        Panel1.add(fire);
        Panel1.add(med);
        Panel1.add(police);
        Panel1.add(text);

        f.setSize(700,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Operator Bot");
        f.add(Panel1);
        f.setVisible(true);

    }

}
