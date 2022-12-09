package songs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent{

    private List<SongComponent> songComponents = new ArrayList<>();
    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    public SongComponent getSongComponent(int index) {
        return songComponents.get(index);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        Iterator songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
