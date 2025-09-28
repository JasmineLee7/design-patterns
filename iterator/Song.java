package iterator;

/**
 * Song represents one track in an album
 * Has a name, artist, length, and genre
 */
public class Song {
    private String name;
    private String artist;
    private double length;
    private Genre genre;

    /**
     * Makes a new Song
     * @param name song title
     * @param artist who made it
     * @param length how long it is (in minutes)
     * @param genre the category of the song
     */
    public Song(String name, String artist, double length, Genre genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * Returns a string with all the song info
     * @return formatted string of song details
     */
    public String toString() {
        return name + " by " + artist + " category: " + genre + " length: " + length + " min";
    }
}