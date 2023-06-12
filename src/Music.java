public class Music {
    static MusicPlayer bgMusic;
    static MusicPlayer bgMusicTemp;
    static SFX soundFX;

    public static void bgMusic() {
        try {
            bgMusic = new MusicPlayer("/resources/sounds/bg_music.wav");
            bgMusicTemp = new MusicPlayer("/resources/sounds/bg_music.wav");
            bgMusicTemp.stop();
            bgMusic.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void sfx() {
        try {
            soundFX = new SFX("/resources/sounds/click.wav");
            soundFX.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void correct() {
        try {
            soundFX = new SFX("/resources/sounds/correct.wav");
            soundFX.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void wrong() {
        try {
            soundFX = new SFX("/resources/sounds/wrong.wav");
            soundFX.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}