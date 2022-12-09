package songs;

public class SongListGenerator {

    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial",
                "is a style of experimental music that draws on transgressive and provocative themes");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal",
                "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");
        SongComponent dubstepMusic = new SongGroup("Dubstep",
                "is a genre of electronic dance music that originated in South London, England");

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");

        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head like a hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1998));

        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey discJockey = new DiscJockey(everySong);
        discJockey.displaySongs();


    }
}
