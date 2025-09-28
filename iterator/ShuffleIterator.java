package iterator;

import java.util.Iterator;
import java.util.Random;

/**
 * ShuffleIterator goes through songs in random order 
 * It does not repeat until all songs have been played
 */
public class ShuffleIterator implements Iterator<Song> {
    private Song[] song;
    private Random rand;
    private int played = 0;

    /**
     * Makes a shuffle iterator for songs
     * @param songs the songs to shuffle through
     */
    public ShuffleIterator(Song[] songs) {
        this.song = songs;
        this.rand = new Random();
    }

    /**
     * Checks if there are still songs left to play
     * @return true if not all songs have been played
     */
    public boolean hasNext() {
        return played < song.length;
    }

    /**
     * Returns a random song from the list
     * @return a Song picked randomly
     */
    public Song next() {
        played++;
        int index = rand.nextInt(song.length);
        return song[index];
    }
}