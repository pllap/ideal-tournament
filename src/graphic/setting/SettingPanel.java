package graphic.setting;

import logic.FontManager;

import javax.swing.*;
import java.awt.*;

public class SettingPanel {

    private JPanel settingPanel;
    private Runnable onBackButton;

    public SettingPanel() {

        settingPanel = new JPanel(new GridLayout(2, 1, 0, 20));
        settingPanel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));
        settingPanel.setBackground(Color.white);

        JButton selectFilePathJButton = new JButton("파일 불러오기");
        selectFilePathJButton.setFont(FontManager.getFont(50));
        settingPanel.add(selectFilePathJButton);

        JButton backButton = new JButton("뒤로 가기");
        backButton.setFont(FontManager.getFont(50));
        backButton.addActionListener(e -> {
            onBackButton.run();
        });
        settingPanel.add(backButton);
    }

    public void addBackButtonClick(Runnable onBackButton) {
        this.onBackButton = onBackButton;
    }

    public JPanel getPanel() {
        return settingPanel;
    }
}
