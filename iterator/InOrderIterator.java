package iterator;

import java.util.Iterator;

/**
 * InOrderIterator goes through songs in normal order
 * Starts at the first song and keeps going until the end
 */
public class InOrderIterator implements Iterator<Song> {
    private Song[] songs;
    private int position;

    /**
     * Makes an in-order iterator for a list of songs
     * @param songs the songs to loop through
     */
    public InOrderIterator(Song[] songs) {
        this.songs = songs;
        this.position = 0;
    }

    /**
     * Checks if there’s another song left
     * @return true if it has not hit the end
     */
    public boolean hasNext() {
        return position < songs.length && songs[position] != null;
    }

    /**
     * Returns the next song in the list
     * @return the next Song
     */
    public Song next() {
        return songs[position++];
    }
}