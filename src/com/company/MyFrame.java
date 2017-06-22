package com.company;

import javax.swing.JFrame;


public class MyFrame extends JFrame {
    MyPanel mp;

    public MyFrame(){
        mp=new MyPanel();
        add(mp);

        setSize(400,460);
        setLocation(100,100);
        setTitle("XO");
        setVisible(true);

    }

}