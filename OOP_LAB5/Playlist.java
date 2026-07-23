import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<String> songs; // list of song names

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSong(String songName) {
        songs.add(songName);
    }
    public void removeSong(String songName) {
        songs.remove(songName);
    }

    public void printSongs() {
        System.out.println("Playlist: " + name);
        if (songs.isEmpty()) {
            System.out.println("No songs in this playlist.");
            return;
        }
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    public int getSongCount() {
        return songs.size();
    }
}