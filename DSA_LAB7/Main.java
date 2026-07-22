public class Main {
    private static void printAll(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].studentInfo());
        }
    }

    private static Student[] createDummyStudents() {
        return new Student[] {
                new Student(1, 1001, "Ayse", "Yilmaz", "A", 85, "ayse.yilmaz@school.edu"),
                new Student(2, 1002, "Mehmet", "Kaya", "A", 92, "mehmet.kaya@school.edu"),
                new Student(3, 1003, "Elif", "Demir", "B", 78, "elif.demir@school.edu"),
                new Student(4, 1004, "Can", "Sahin", "A", 85, "can.sahin@school.edu"),
                new Student(5, 1005, "Zeynep", "Acar", "B", 90, "zeynep.acar@school.edu"),
                new Student(6, 1006, "Mert", "Ozkan", "A", 73, "mert.ozkan@school.edu"),
                new Student(7, 1007, "Derya", "Kilic", "B", 92, "derya.kilic@school.edu"),
                new Student(8, 1008, "Kerem", "Aslan", "A", 88, "kerem.aslan@school.edu"),
                new Student(9, 1009, "Ece", "Celik", "B", 85, "ece.celik@school.edu"),
                new Student(10, 1010, "Bora", "Arslan", "A", 60, "bora.arslan@school.edu"),
                new Student(11, 1011, "Sena", "Kurt", "B", 90, "sena.kurt@school.edu"),
                new Student(12, 1012, "Emir", "Yildiz", "A", 78, "emir.yildiz@school.edu"),
                new Student(13, 1013, "Naz", "Erdogan", "B", 95, "naz.erdogan@school.edu"),
                new Student(14, 1014, "Baran", "Tas", "A", 88, "baran.tas@school.edu"),
                new Student(15, 1015, "Irem", "Gunes", "B", 73, "irem.gunes@school.edu"),
                new Student(16, 1016, "Ozan", "Polat", "A", 67, "ozan.polat@school.edu"),
                new Student(17, 1017, "Selin", "Aksoy", "B", 85, "selin.aksoy@school.edu"),
                new Student(18, 1018, "Hakan", "Karaca", "A", 92, "hakan.karaca@school.edu"),
                new Student(19, 1019, "Nisa", "Yavuz", "B", 60, "nisa.yavuz@school.edu"),
                new Student(20, 1020, "Eren", "Cetin", "A", 95, "eren.cetin@school.edu")
        };
    }

    private static Student[] addStudent(Student[] arr, Student newStudent) {
        Student[] out = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) out[i] = arr[i];
        out[arr.length] = newStudent; // sona ekle (unsorted)
        return out;
    }

    public static void main(String[] args) {
        Student[] studentList = createDummyStudents();

        System.out.println("===== SORT BY GRADE (FIRST TIME) =====");
        StudentSorter.insertionSortStudent(studentList, true);
        printAll(studentList);

        System.out.println("\n===== AFTER ADDING NEW STUDENT (UNSORTED) =====");

        Student newStudent = new Student(21, 1021, "Yeni", "Ogrenci", "A", 85, "yeni.ogrenci@school.edu");

        Student[] studentListWithNew = addStudent(studentList, newStudent);
        printAll(studentListWithNew);

        System.out.println("\n===== SORT BY GRADE (AFTER INSERTION - BINARY INSERTION SORT) =====");
        StudentSorter.binaryInsertionSortStudent(studentListWithNew, true);
        printAll(studentListWithNew);

        System.out.println("\n===== SORT BY STUDENT ID (ASC) =====");
        StudentSorter.binaryInsertionSortStudent(studentListWithNew, false);
        printAll(studentListWithNew);

        System.out.println("\nNote:");
        System.out.println("When sorting by grade, same-grade students keep their original order (stable).");
    }
}