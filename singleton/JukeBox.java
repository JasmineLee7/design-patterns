package singleton;

import java.util.ArrayList;
/**
 * JukeBox is the main music player.  
 * It’s a singleton, so only one JukeBox exists.  
 * It loads songs and lets you request one by number. 
 */
public class JukeBox {
    public static JukeBox jukeBox;
    ArrayList<Song> songs = new ArrayList<>();

    /**
     * Private constructor so only one JukeBox is made.  
     * Loads all the songs through DataLoader. 
     */
    private JukeBox() {
        songs = new DataLoader().getSongs();
    }

    /**
     * creates one jukebox instance 
     * @return the single JukeBox
     */
    public static JukeBox getInstance(){
        if(jukeBox==null){
            System.out.println("Creating a JukeBox");
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }

    /**
     * Gets all songs loaded into the JukeBox  
     * @return list of songs
     */
    public ArrayList<Song> getAllSongs(){
        return songs;
    }

    /**
     * Plays a song by its number in the list
     * Handles invalid numbers or empty lists
     * @param num the song number 
     */
    public void requestSong(int num) {
        if (songs == null || songs.isEmpty()) {
            System.out.println("No songs available.");
            return;
        }
        if (num < 1 || num > songs.size()) {
            System.out.println("Invalid selection.");
            return;
        }
        Song song = songs.get(num-1);
        System.out.println("Playing " + song.toString());
        song.play();
    }

}
