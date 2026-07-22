import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] data = {50, 30, 70, 20, 40, 60, 80, 35, 45, 65};
        for (int v : data) tree.insert(v);

        System.out.print("Initial BST (inorder): ");
        tree.printInOrder();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to insert into the BST: ");
        int userNum = sc.nextInt();
        tree.insert(userNum);

        System.out.print("BST after inserting " + userNum + " (inorder): ");
        tree.printInOrder();

        System.out.print("Enter a number to delete from the BST: ");
        int del = sc.nextInt();
        tree.delete(del);

        System.out.print("BST after deleting " + del + " (inorder): ");
        tree.printInOrder();

        sc.close();
    }
}
