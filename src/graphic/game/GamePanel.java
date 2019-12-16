package graphic.game;

import logic.ContentItem;
import logic.FileManager;
import logic.ListManager;

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
    List<ContentItem> currentContents;
    List<ContentItem> winners = new ArrayList<>();
    FileManager fileManager;

    ContentItem winner;

    public GamePanel() {

        gamePanel.setBorder(BorderFactory.createEmptyBorder(30,50,100,50));
        gamePanel.setBackground(Color.white);

        fileManager = new FileManager();
        currentContents = fileManager.getShuffledContents();

        setStageLayout();
    }

    public void setStageLayout() {


        leftContent = new ContentPanel(currentContents.get(currentRound * 2));
        rightContent = new ContentPanel(currentContents.get(currentRound * 2 + 1));

        currentRoundLabel = new JLabel(Integer.toString(currentRound + 1) + "/" + Integer.toString(currentContents.size() / 2));
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

        System.out.println("==========");
        winners.add(selectedItem);
        ++currentRound;
        System.out.println(currentRound + "라운드: " + selectedItem);
        System.out.println();
        System.out.println("currentRound: " + (currentRound));
        System.out.println("num of contents: " + currentContents.size());

        if (currentRound == currentContents.size() / 2) {
            increaseLevel();
        }
        if (currentContents.size() == 1) {
            winner = winners.get(0);
        }
        gamePanel.removeAll();

        setStageLayout();

        gamePanel.revalidate();
        gamePanel.repaint();
    }

    public void increaseLevel() {
        System.out.println("==========");
        System.out.println("increaseLevel() 실행");
        currentContents = winners;
        winners = new ArrayList<>();
        currentRound = 0;
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

    public JPanel getPanel() {
        return gamePanel;
    }

}
