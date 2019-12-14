package events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();
        String compare = button.getText();
        switch (compare) {
            case "게임 시작":
                System.out.println("start");
                break;
            case "설정":
                System.out.println("setting");
                break;
            case "게임 종료":
                System.exit(0);
        }
    }
}
