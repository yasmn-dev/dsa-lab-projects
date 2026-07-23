import java.util.Date;
import java.util.Calendar;

public class TestHomework {
    public static void main(String[] args) {
        Date now = new Date();
        Homework hw1 = new Homework("SENG 211 - OOP", "Array vs ArrayList", now);
        hw1.printInfo();

        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.DECEMBER, 10, 23, 59);
        Date deadline = cal.getTime();
        Homework hw2 = new Homework(
                "CENG 201 - Algorithms",
                "BST",
                deadline);
        hw2.printInfo();
    }
}
