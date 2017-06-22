package com.company;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class MyPanel extends JPanel implements MouseListener{

    Dasht dt;

    public MyPanel(){
        setBackground(Color.YELLOW);
        dt= new Dasht(this);
        this.addMouseListener(this);


    }
    public void paint(Graphics g){
        super.paint(g);
        dt.paint(g);



    }
    @Override
    public void mouseClicked(MouseEvent e) {

        dt.click(e.getX(),e.getY());

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}