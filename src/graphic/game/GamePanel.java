package graphic.game;

import logic.ContentItem;
import logic.FileManager;
import logic.FontManager;

import javax.swing.*;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    ContentItem winner = null;

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

        currentRoundLabel = new JLabel((currentRound + 1) + "/" + currentContents.size() / 2);
        currentRoundLabel.setFont(new Font("a옛날사진관4", Font.PLAIN, 50));
        currentRoundLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentRoundLabel.setVerticalAlignment(SwingConstants.CENTER);

        leftContent.addContentClick(this::onContentClick);
        rightContent.addContentClick(this::onContentClick);

        gamePanel.add(currentRoundLabel, BorderLayout.NORTH);
        gamePanel.add(leftContent.getPanel(), BorderLayout.WEST);
        gamePanel.add(rightContent.getPanel(), BorderLayout.EAST);
    }

    public void setResultLayout(ContentItem winner) {

        JLabel winnerName = new JLabel("승자: " + winner.toString());
        ResultPanel winnerContent = new ResultPanel(winner);
        JButton restartButton = new JButton("다시 시작?");

        winnerName.setFont(FontManager.getFont(50));
        winnerName.setHorizontalAlignment(SwingConstants.CENTER);

        restartButton.setFont(FontManager.getFont(30));
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        gamePanel.add(winnerName, BorderLayout.NORTH);
        gamePanel.add(winnerContent.getPanel(), BorderLayout.CENTER);
        gamePanel.add(restartButton, BorderLayout.SOUTH);
    }

    public void onContentClick(ContentItem selectedItem) {

        System.out.println("==========");
        winners.add(selectedItem);
        ++currentRound;
        System.out.println(currentRound + "라운드: " + selectedItem);
        System.out.println();
        System.out.println("currentRound: " + (currentRound));
        System.out.println("num of contents: " + currentContents.size());

        // end of each level
        if (currentRound == currentContents.size() / 2) {
            increaseLevel();
        }

        gamePanel.removeAll();

        // end of game
        if (currentContents.size() == 1) {
            setResultLayout(selectedItem);
        }
        else {
            setStageLayout();
        }

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

    public ContentItem getWinner() {
        return winner;
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
