public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.printList();
        System.out.println();

        // 1. Step : (Push)
        System.out.println("--- 1. PUSH ---");
        stack.push(10); // Size 1. Middle: 10
        stack.printList();
        stack.push(20); // Size 2. Middle: 10
        stack.printList();
        stack.push(30); // Size 3. Middle: 20 (middle.prev)
        stack.printList();
        stack.push(40); // Size 4. Middle: 20
        stack.printList();
        stack.push(50); // Size 5. Middle: 30 (middle.prev)
        stack.printList();
        System.out.println();

        // 2. Step: Pop
        System.out.println("--- 2. POP ---");
        int popped = stack.pop();
        System.out.println("Deleted Node(Pop): " + popped);
        stack.printList();
        System.out.println();

        // 3. Step : Delete Middle Node
        System.out.println("--- 3. DELETE MIDDLE ---");
        int deleted = stack.deleteMiddle(); // Size decrease from 4 to 3 Middle 20, new Middle 30 (middle.prev)
        System.out.println("Deleted Middle Element: " + deleted);
        stack.printList();
    }
}
