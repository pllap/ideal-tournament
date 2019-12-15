package events;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import graphic.game.SelectionPanel;

import javax.swing.*;

public class SelectionListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        SelectionPanel selectedPanel = (SelectionPanel) e.getSource();
        if (selectedPanel.getBackground().equals(Color.lightGray)) {
            System.out.println("true");
            selectedPanel.setSelected(true);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JPanel selectedPanel = (JPanel) e.getSource();
        selectedPanel.setBackground(Color.lightGray);
        System.out.println("lightgray");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JPanel selectedPanel = (JPanel) e.getSource();
        selectedPanel.setBackground(Color.white);
        System.out.println("white");
//        if (selectedPanel.getSelected()) {
//            System.out.println("false");
//            selectedPanel.setSelected(false);
//        }
    }
}
