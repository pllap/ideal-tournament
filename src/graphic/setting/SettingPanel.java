package graphic.setting;

import logic.FontManager;
import logic.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class SettingPanel {

    private JPanel settingPanel;
    private Runnable onBackButton;
    private FileDialog fileDialog;
    private JFrame dialogFrame;

    public SettingPanel() {

        settingPanel = new JPanel(new GridLayout(2, 1, 0, 20));
        settingPanel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));
        settingPanel.setBackground(Color.white);

        JButton selectFilePathJButton = new JButton("파일 불러오기");
        selectFilePathJButton.setFont(FontManager.getFont(50));
        selectFilePathJButton.addActionListener(event -> {
            SoundManager.playClick();
            String fpath = loadFilePath();
            String fname = loadFileName();
            File source = new File(fpath+fname);
            File dest = new File("res/img/"+fname);
            try {
                Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        });
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

    public String loadFilePath() {
        fileDialog = new FileDialog(dialogFrame, "Open File", 0);
        fileDialog.setDirectory("C:");
        fileDialog.setVisible(true);
        return fileDialog.getDirectory();
    }

    public String loadFileName() {
        return fileDialog.getFile();
    }

    public JPanel getPanel() {
        return settingPanel;
    }
}
