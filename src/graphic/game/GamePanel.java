package graphic.game;

import logic.ContentItem;
import logic.FileManager;
import logic.FontManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GamePanel {

    private JPanel gamePanel = new JPanel(new BorderLayout());

    int currentRound;
    JLabel currentRoundLabel;

    ContentPanel leftContent;
    ContentPanel rightContent;
    List<ContentItem> currentContents;
    List<ContentItem> winners = new ArrayList<>();
    FileManager fileManager;

    ContentItem winner = null;

    Runnable onGameEndButton;

    public GamePanel() {

        gamePanel.setBorder(BorderFactory.createEmptyBorder(30,50,100,50));
        gamePanel.setBackground(Color.white);

        fileManager = new FileManager();
        currentContents = fileManager.getShuffledContents();

        setStageLayout();
    }

    public void setStageLayout() {

        System.out.println("setStageLayout()");

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

        System.out.println("setResultLayout()");

        JLabel winnerName = new JLabel("승자: " + winner.toString());
        ResultPanel winnerContent = new ResultPanel(winner);
        JButton restartButton = new JButton("다시 시작?");

        winnerName.setFont(FontManager.getFont(50));
        winnerName.setHorizontalAlignment(SwingConstants.CENTER);

        restartButton.setFont(FontManager.getFont(30));
        restartButton.addActionListener(e -> onGameEndButton.run());

        gamePanel.add(winnerName, BorderLayout.NORTH);
        gamePanel.add(winnerContent.getPanel(), BorderLayout.CENTER);
        gamePanel.add(restartButton, BorderLayout.SOUTH);
    }

    public void addRestartGame(Runnable onGameEndButton) {
        this.onGameEndButton = onGameEndButton;
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
        if (currentRound == currentContents.size() / 2 && currentContents.size() != 1) {
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

    public void resetGame() {
        System.out.println("==========");
        System.out.println("resetGame() 실행");

        gamePanel.removeAll();

        currentContents = fileManager.getShuffledContents();
        winners = new ArrayList<>();
        currentRound = 0;

        setStageLayout();
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
