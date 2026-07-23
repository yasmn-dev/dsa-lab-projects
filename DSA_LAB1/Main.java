public class Main {
    public static void main(String[] args) {
        DoublyLinkedPlaylist playlist = new DoublyLinkedPlaylist();
        playlist.addSong("Sting - Shape of My heart");
        playlist.addSong("Steelheart - She's gone");
        playlist.addSong("Bill Withers - Ain't No Sunshine");
        playlist.addSong("Metallica - Nothing Else Matters");
        playlist.addSong("Linkin Park - Numb");
        playlist.addSong("Cem Karaca - Bu Son Olsun");

        playlist.printPlaylist();

        playlist.nextSong();
        playlist.nextSong();
        playlist.nextSong();
        playlist.nextSong();
        playlist.previousSong();
        playlist.previousSong();
        playlist.removeCurrent();
        playlist.printPlaylist();
        playlist.nextSong();
        playlist.nextSong();
        playlist.printPlaylist();
    }
}
