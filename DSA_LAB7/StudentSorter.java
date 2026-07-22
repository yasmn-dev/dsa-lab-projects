public class StudentSorter {
    public static void insertionSortStudent(Student[] students, boolean byGrade) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            if (byGrade) {
                while (j >= 0 && students[j].grade > key.grade) {
                    students[j + 1] = students[j];
                    j--;
                }
            } else {
                while (j >= 0 && students[j].studentId > key.studentId) {
                    students[j + 1] = students[j];
                    j--;
                }
            }
            students[j + 1] = key;
        }
    }

    public static void binaryInsertionSortStudent(Student[] students, boolean byGrade) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];

            int insertPos = binarySearchInsertPos(students, key, 0, i - 1, byGrade);
            int j = i - 1;
            while (j >= insertPos) {
                students[j + 1] = students[j];
                j--;
            }
            students[insertPos] = key;
        }
    }

    public static int binarySearchInsertPos(Student[] students, Student key, int low, int high, boolean byGrade) {
        int keyVal = byGrade ? key.grade : key.studentId;
        int lo = low;
        int hi = high;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midVal = byGrade ? students[mid].grade : students[mid].studentId;

            if (keyVal < midVal) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo; // insertion position
    }
}
