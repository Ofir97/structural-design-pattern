public class AdapterTest {

    /**
     * Adapter pattern works as a bridge between two incompatible interfaces.
     * This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
     *
     * In this example, an audio player device can play mp3 files only and wants to use an advanced audio player capable of playing vlc and mp4 files.
     *
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }
}
