public class Queue {
    Node head;
    Node tail;
    int size;
    public Queue(){
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }
    // Add at tail
    void enqueue(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next =newNode;
            tail = newNode;
        }
        size++;
    }
    // Remove from head
    int dequeue(){
        if(head == null){
            return -1;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }
    // To check if two queues are the same
    boolean areEqual(Queue q1, Queue q2){
        if(q1.size != q2.size){
            return false;
        }
        Node curr1 = q1.head;
        Node curr2 = q2.head;

        while(curr1 != null && curr2 != null){
            if(curr1.data != curr2.data)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }
    void display(){
        Node current = head;
        System.out.println("Queue size: "+size);

        if(current == null){
            System.out.println("[EMPTY]");
            return;
        }
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
