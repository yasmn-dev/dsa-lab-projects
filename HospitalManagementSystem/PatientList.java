// Linked list structure
public class PatientList {
    private Node head;
    // Inner node class
    private class Node{
        Patient data;
        Node next;
        // Node constructor
        Node(Patient data){
            this.data = data;
            this.next = null;
        }
    }
    // Adds a new patient to the end of the list
    public void addPatient(Patient p){
        Node newNode = new Node(p);
        // If the list is empty, returns null. New patient becomes the head.
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next; // 'current' holds the last node of the list
        }
        current.next = newNode; // Add new patient to the end
    }
    // Removes a patient from the list by patient ID
    public boolean removePatient(int id){
        // If the list is empty, nothing changes. Returns false
        if(head == null){
            return false;
        }
        // If the patient is at the head of the list, removes from the head
        if(head.data.id == id){
            head = head.next;
            return true;
        }
        // Traverse the list to find the patient
        Node current = head;
        while(current.next != null) {
            //If the next node contains the patient, skip the node
            if (current.next.data.id == id) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false; // Patient not found
    }
    // Searches for a patient by ID
    public Patient findPatient(int id){
        //If the list is empty
        if(head == null){
            return null;
        }
        Node current = head;
        //Traverse the list
        while(current != null){
            if(current.data.id == id){
                return current.data;
            }
            current = current.next;
        }
        return null; // Patient not found
    }
    // Prints all patients in the system
    public void printList(){
        Node current = head;

        if(current == null) {
            System.out.println("There is no patient in the system.");
        }else {
            System.out.println("Patients registered in the system:");
            while(current != null){
                System.out.println(current.data.name+" Severity: " + current.data.severity);
                current = current.next;
            }
        }
    }
    // MERGE SORT: Sorts patients by severity
    public void sortBySeverity() {
        head = mergeSort(head);
    }
    //
    private Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        // Split list into two parts
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node array1 = mergeSort(head);
        Node array2 = mergeSort(nextOfMiddle);

        // Merge two sorted parts
        return merge(array1, array2);
    }

    // Finds the middle node using slow-fast pointer technique
    private Node getMiddle(Node head) {

        if (head == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merges two sorted linked lists by severity
    // Variable names are aligned with the instructor's example
    private Node merge(Node array1, Node array2) {

        Node combined = new Node(null);

        Node index = combined;
        Node i = array1;
        Node j = array2;

        while (i != null && j != null) {

            // Higher severity comes first
            if (i.data.severity >= j.data.severity) {
                index.next = i;
                index = index.next;
                i = i.next;
            } else {
                index.next = j;
                index = index.next;
                j = j.next;
            }
        }

        // Attach remaining nodes
        while (i != null) {
            index.next = i;
            index = index.next;
            i = i.next;
        }

        while (j != null) {
            index.next = j;
            index = index.next;
            j = j.next;
        }

        return combined.next;
    }
}