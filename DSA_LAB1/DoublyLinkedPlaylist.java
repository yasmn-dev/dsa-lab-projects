class DoublyLinkedPlaylist {
    private Song head;
    private Song tail;
    private Song current;

    // Add song to end
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = tail = current = newSong;
            return;
        }
        tail.next = newSong;
        newSong.prev = tail;
        tail = newSong;
    }

    // Remove song
    public void removeCurrent() {
        if (current == null)
            return;
        System.out.println("Removing: " + current.title);
        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next; // removing head

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev; // removing tail

        current = current.next != null ? current.next : head;
    }

    // Move forward
    public void nextSong(){
        if(current != null && current.next != null){
            current = current.next;
            System.out.println("Now playing: "+ current.title);
        }else{
            System.out.println("End of the list.");
        }
    }

    // Move backward
    public void previousSong(){
        if(current != null && current.prev != null){
            current = current.prev;
            System.out.println("Now playing: "+ current.prev.title);
        }else{
            System.out.println("Start of the playlist.");
        }
    }

    public void printPlaylist() {
        Song temp = head;
        System.out.println("Playlist: ");
        while (temp != null) {
            System.out.println("* " + temp.title);
            temp = temp.next;
        }
        System.out.println("END\n");
    }
}