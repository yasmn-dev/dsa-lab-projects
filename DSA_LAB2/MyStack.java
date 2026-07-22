public class MyStack {
    Node head;
    Node middle;
    int size;
    public MyStack(){
        this.head = null;
        this.middle = null;
        this.size = 0;
    }

    void push(int data){
        Node newNode = new Node(data);
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
        if(size == 1){
            middle = head;
        }else if(size % 2 != 0){
            middle = newNode;
            middle = middle.prev;
        }
    }
    int pop() {
        if (head == null) {
            return -1;
        }
        int value = head.data;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }
        size--;

        if (size == 0) {
            middle = null;
        } else if (size % 2 == 0 && middle != null) {
            middle = middle.next;
        }
        return value;
    }
    int deleteMiddle() {
        if (size == 0 || middle == null) {
            System.out.println("ERROR : Stack EMPTY.");
            return -1;
        }
        int val = middle.data;

        if (middle.prev != null){
            middle.prev.next = middle.next;
        }
        if (middle.next != null){
            middle.next.prev = middle.prev;
        }
        size--;
        // Found the new middle
        if (size % 2 == 0) {
            middle = middle.next; // size even
        } else {
            middle = middle.prev; // size odd
        }
        return val;
    }
    void printList() {
        Node current = head;
        System.out.print("Stack Size: " + size + "-> ");

        if (current == null) {
            System.out.println("[EMPTY]");
            return;
        }
        while (current != null) {
            System.out.print(current.data);
            if (current == middle) {
                System.out.print(" (Middle)");
            }
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
