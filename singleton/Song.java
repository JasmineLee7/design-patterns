package singleton;
/**
 * Song class holds information about a song and plays it
 * It stores the title, artist, and file path for the audio.  
 * Can print info out and can be played. 
 */
public class Song {
    private String title;
    private String artist;
    private String filePath;

    /**
     * Makes a song then 
     * trims extra spaces and handles nulls  
     * @param title the song title
     * @param artist the artist name
     * @param fileName the file path or name for the song
     */
    public Song(String title, String artist, String fileName) {
        this.title = title == null ? "" : title.trim();
        this.artist = artist == null ? "" : artist.trim();
        this.filePath = fileName == null ? "" : fileName.trim();
    }

    /*
     * gives the song name and artist
     * @return song title by song artist
     */
    public String toString() {
        return title + " by " + artist;
    }

    /*
     * Play() plays the song using songplayer using the path 
     */
    public void play() {
        SongPlayer.play(filePath); 
    }
}