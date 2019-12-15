package graphic.game;

import logic.ContentItem;
import logic.FileManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GamePanel {

    private JPanel gamePanel = new JPanel(new BorderLayout());

    int currentRound;
    int currentLevel;
    JLabel currentRoundLabel;

    ContentPanel leftContent;
    ContentPanel rightContent;
    List<ContentItem> winners = new ArrayList<>();
    FileManager fileManager;

    public GamePanel() {

        gamePanel.setBorder(BorderFactory.createEmptyBorder(30,50,100,50));
        gamePanel.setBackground(Color.white);

        JLabel currentLevel = new JLabel(Integer.toString(currentRound));
        currentLevel.setHorizontalAlignment(SwingConstants.CENTER);
        gamePanel.add(currentLevel, BorderLayout.NORTH);

        fileManager = new FileManager();

        setStageLayout();
    }

    public void setStageLayout() {
        leftContent = new ContentPanel(fileManager.getContents().get(currentRound * 2));
        rightContent = new ContentPanel(fileManager.getContents().get(currentRound * 2 + 1));
        currentRoundLabel = new JLabel(Integer.toString(currentRound));

        currentRoundLabel.setFont(new Font("a옛날사진관4", Font.PLAIN, 50));
        currentRoundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentRoundLabel.setVerticalAlignment(SwingConstants.CENTER);

        leftContent.addContentClick(this::onContentClick);
        rightContent.addContentClick(this::onContentClick);

        gamePanel.add(currentRoundLabel, BorderLayout.NORTH);
        gamePanel.add(leftContent.getPanel(), BorderLayout.WEST);
        gamePanel.add(rightContent.getPanel(), BorderLayout.EAST);
    }

    public void onContentClick(ContentItem selectedItem) {

        winners.add(selectedItem);
        ++currentRound;
        System.out.println(selectedItem);
        System.out.println(currentRound);

        gamePanel.removeAll();

        setStageLayout();

        gamePanel.revalidate();
        gamePanel.repaint();
    }

    public void getCurrentRound() {

    }

    public void printCurrentRound() {

    }

    public void setLeftContent() {

    }

    public void setRightContent() {

    }

    public void addWinnerList() {

    }

    public void increaseLevel() {

    }

    public JPanel getPanel() {
        return gamePanel;
    }

}
