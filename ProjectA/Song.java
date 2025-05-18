package ProjectA;

public class Song {
    private String title;
    private String artist;
    private int playCount;

    // constructor to create a new song
    public Song(String title, String artist, int playCount) {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    // getters to access the song details elsewhere
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayCount() {
        return playCount;
    }

    // make it print nicely when displaying songs
    @Override
    public String toString() {
        return "\"" + title + "\" by " + artist + " - Plays: " + playCount;
    }
}
