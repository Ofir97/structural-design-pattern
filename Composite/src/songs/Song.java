package songs;

public class Song extends SongComponent{

    private String songName;
    private String bandName;
    private int releaseName;

    public Song(String songName, String bandName, int releaseName) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseName = releaseName;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getReleaseName() {
        return releaseName;
    }

    public void displaySongInfo() {
        System.out.println("\tSong: " + songName + " was recorded by " + bandName + " in " + releaseName);
    }
}
