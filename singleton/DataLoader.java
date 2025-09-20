package singleton;

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
/**
 * DataLoader reads songs from a text file.  
 * It builds Song objects from each line and returns them as a list 
 * which is how the JukeBox knows what songs exist
 */
public class DataLoader {
    /**
     * Reads songs.txt and makes Song objects out of it
     * Each line is title:artist:file. Skips comments or empty lines  
     * @return list of Song objects
     */
    public ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();

        Path txt = Files.exists(Paths.get("songs.txt")) ? Paths.get("songs.txt") : Paths.get("singleton", "songs.txt");
        
        Path path = (txt.getParent() == null) ? Paths.get("") : txt.getParent();
        Path songPath = path.resolve("songs");
        boolean hasSongPath = Files.isDirectory(songPath);

        try { 
            List<String> lines = Files.readAllLines(txt);
            for (String raw : lines) {
                String line = raw.trim();
                if (line.isEmpty() || line.startsWith("#")) continue;

                String[] parts = line.split(",", 3);
                if (parts.length < 3) continue;

                String title  = parts[0].trim();
                String artist = parts[1].trim();
                String file   = parts[2].trim();

                Path filePath = Paths.get(file);
                Path resolved = filePath.isAbsolute() ? filePath : (hasSongPath ? songPath.resolve(filePath) : path.resolve(filePath));

                songs.add(new Song(title, artist, resolved.toString()));
            }
        } catch (IOException e) {
            System.out.println("Could not read songs " + e.getMessage());
        }
        return songs;
    }
}