package iterator;

import java.util.Iterator;

/**
 * Album is a collection of songs
 * Album lets you add songs and create iterators (in order or shuffle)
 */
public class Album {
    private Song[] songs;
    private int count;
    private String name;

    /**
     * Makes an Album with a name
     * Can hold up to 100 songs
     * @param name the album name
     */
    public Album(String name) {
        this.name = name;
        this.songs = new Song[100];
        this.count = 0;
    }

    /**
     * Adds a song to the album if there’s space
     * @param name song title
     * @param artist artist name
     * @param length song length in minutes
     * @param genre the song’s genre
     * @return true if added, false if album is full
     */
    public boolean addSong(String name, String artist, double length, Genre genre) {
        if (count < songs.length) {
            songs[count] = new Song(name, artist, length, genre);
            count++;
            return true;
        }
        return false;
    }

    /**
     * Makes an iterator that plays songs in normal order
     * @return an InOrderIterator
     */
    public Iterator<Song> createInOrderIterator() {
        Song[] actualSongs = new Song[count];
        for (int i = 0; i < count; i++) {
            actualSongs[i] = songs[i];
        }
        return new InOrderIterator(actualSongs);
    }

    /**
     * Makes an iterator that plays songs in random order
     * @return a ShuffleIterator
     */
    public Iterator<Song> createShuffleIterator() {
        Song[] actualSongs = new Song[count];
        for (int i = 0; i < count; i++) {
            actualSongs[i] = songs[i];
        }
        return new ShuffleIterator(actualSongs);
    }

    /**
     * Gets the name of this album  
     * @return album name
     */
    public String getName() {
        return name;
    }
}