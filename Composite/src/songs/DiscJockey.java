package songs;

public class DiscJockey {

    private SongComponent songComponent;

    public DiscJockey(SongComponent songComponent) {
        this.songComponent = songComponent;
    }

    public void displaySongs() {
        songComponent.displaySongInfo();
    }
}
