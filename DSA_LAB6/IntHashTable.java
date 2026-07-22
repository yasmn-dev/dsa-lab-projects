public class IntHashTable {
    private static class Node {
        int id;
        String name;
        double grade;
        Node next;
        Node(int id, String name, double grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
            this.next = null;
        }
    }
    private Node[] table;

    public IntHashTable(int tableSize) {
        table = new Node[tableSize];
    }

    private int hash(int id) {
        return Math.abs(id) % table.length;
    }

    public void set(int id, String name, double grade) {
        int index = hash(id);
        Node current = table[index];

        while (current != null) {
            if (current.id == id) {
                current.name = name;
                current.grade = grade;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(id, name, grade);
        Node oldHead = table[index];
        newNode.next = oldHead;
        table[index] = newNode;
    }

    public String get(int id) {
        int index = hash(id);
        Node current = table[index];

        while (current != null) {
            if (current.id == id) {
                return "ID=" + current.id
                        + ", Name=" + current.name
                        + ", Grade=" + current.grade;
            }
            current = current.next;
        }
        return null;
    }

    public double getAverageGrade() {
        double sum = 0.0;
        int count = 0;

        for (int i = 0; i < table.length; i++) {
            Node current = table[i];

            while (current != null) {
                sum += current.grade;
                count++;
                current = current.next;
            }
        }
        if (count == 0) {
            return -1.0; // no students
        }
        return sum / count;
    }

    public boolean remove(int id) {
        int index = hash(id);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.id == id) {
                // case 1: removing head
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    // case 2: removing middle/last
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public void printTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Table Node " + i + ": ");

            if (table[i] == null) {
                System.out.println("empty");
                continue;
            }

            Node current = table[i];
            while (current != null) {
                System.out.print("[ID=" + current.id +
                        ", Name=" + current.name +
                        ", Grade=" + current.grade + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}
