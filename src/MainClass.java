import events.BackgroundMusic;
import graphic.MainFrame;

public class MainClass {

    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();

        Thread backgroundMusic = new Thread(new BackgroundMusic());
        backgroundMusic.start();
    }
}
