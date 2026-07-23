public class TestPlaylist {
    public static void main(String[] args) {
        Playlist p1 = new Playlist("My Favorite Songs");

        p1.addSong("Le Jardin des larmes");
        p1.addSong("Here Comes the Sun");
        p1.addSong("This I Love");

        p1.printSongs();
        System.out.println("Total songs: " + p1.getSongCount());

        System.out.println("\nRemoving 'Song 2'...\n");
        p1.removeSong("Song 2");

        p1.printSongs();
        System.out.println("Total songs: " + p1.getSongCount());
    }
}
