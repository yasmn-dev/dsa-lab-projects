// Queue structure
public class TreatmentQueue {
    private Node head;
    private Node tail;
    private int size;
    // Inner node class
    private class Node{
        TreatmentRequest data;
        Node next;
        // Node constructor
        Node(TreatmentRequest data){
            this.data = data;
            this.next = null;
        }
    }
    // Adds a new treatment request and priority patients placed before normal patients
    public void enqueue(TreatmentRequest request){
        Node newNode = new Node(request);
        // Queue is empty
        if( head == null ) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        // Normal request(non-priority): Adds to the end of the queue
        if (request.priority == false) {
            tail.next = newNode;
            tail = newNode;
            size++;
            return;
        }
        // Priority request: Head is normal so, adds new patient at the front
        if (head.data.priority == false) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        // Priority request: There are priority patients so, adds after the last priority patient
        Node current = head;

        while (current.next != null && current.next.data.priority == true) {
            current = current.next;  // Stops after the last priority patient
        }
        newNode.next = current.next;
        current.next = newNode;

        // If new patient was added to the end, update tail
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;

    }
    // Removes and returns the treatment request at the front of the queue
    // If the queue is empty,returns null
    public TreatmentRequest dequeue() {

        if ( head == null ) {
            return null;
        }
        // Store the request to be removed
        TreatmentRequest x = head.data;
        head = head.next;
        size--;

        // If queue becomes empty, update tail
        if (head == null) {
            tail = null;
        }
        return x;
    }
    // Returns the number of treatment requests
    public int size() {
        return size;
    }
    // Prints all waiting treatment requests in the queue
    public void printQueue() {
        Node current = head;

        if (current == null) {
            System.out.println("Empty");
            return;
        }
        // Traverse and print each treatment request
        System.out.println("\nWaiting Treatment Requests: ");
        while (current != null) {
            System.out.println("Patient ID: " + current.data.patientId +" , Arrival time: " + current.data.arrivalTime +" , Priority: " + current.data.priority);
            current = current.next;
        }
    }
}
