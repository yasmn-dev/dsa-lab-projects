// Stack structure
public class DischargeStack {
    private Node top;
    // Inner node class
    private class Node{
        DischargeRecord data;
        Node next;
        // Node constructor
        Node(DischargeRecord data){
            this.data = data;
            this.next = null;
        }
    }
    // Pushes a new discharge record onto the stack
    public void push(DischargeRecord record){
        Node newNode = new Node(record);
        // If stack is empty, new node becomes the top
        if(top == null){
            top = newNode;
        }else{
            // Insert new node at the top
            newNode.next = top;
            top = newNode;
        }
    }
    // Removes and returns the top discharge record from the stack
    // If the stack is empty, returns null
    public DischargeRecord pop(){
        if (top == null){
            return null;
        }else{
            Node current = top;
            top = top.next;
            return current.data;
        }
    }
    // Returns the top discharge record without removing it
    public DischargeRecord peek(){
        if (top == null){
            return null;
        }else{
            return top.data;
        }
    }
    // Prints all discharge records in the stack
    public void printStack(){
        System.out.println("\nDISCHARGE RECORDS: ");
        Node current = top;

        if (current == null){
            System.out.println("No discharged patients at the moment.");
        }else{
            // Traverse and print each discharge record
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}