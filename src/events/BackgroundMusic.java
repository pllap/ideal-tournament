package events;

import logic.SoundManager;

public class BackgroundMusic implements Runnable {

    @Override
    public void run() {
        SoundManager.playBgm();
    }
}
