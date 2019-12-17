package logic;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundManager {

    private static File bgm = new File("res/sound/for_you.wav");
    private static File click = new File("res/sound/click.wav");

    public static void playBgm() {

        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(bgm);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void playClick() {

        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(click);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
