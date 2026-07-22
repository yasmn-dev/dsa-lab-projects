public class HashTable {
    public static void main(String[] args) {

        // Create a hash table with a small TABLE SIZE.
        // Small capacity is intentional so that we can easily see collisions.
        IntHashTable index = new IntHashTable(5);

        // Insert some example students.
        // These IDs are chosen so that some of them collide when we use "id % 5" as the hash function.
        index.set(1001, "Alice", 85.5);
        index.set(1006, "Bob", 72.0);
        index.set(1011, "Charlie", 90.0);
        index.set(2002, "Diana", 60.0);
        index.set(3003, "Eve", 95.5);

        index.printTable();

        // Search for an existing student
        int searchId = 1011;
        String result = index.get(searchId);
        if (result != null) {
            System.out.println("Found student: " + result);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

        // Search for a non-existing student
        int missingId = 9999;
        String result2 = index.get(missingId);
        if (result2 != null) {
            System.out.println("Found student: " + result2);
        } else {
            System.out.println("Student with ID " + missingId + " not found.");
        }

        double avg = index.getAverageGrade();
        if (avg >= 0) {
            System.out.println("Average grade in table = " + avg);
        } else {
            System.out.println("No students in the table, average is undefined.");
        }
    }
}
