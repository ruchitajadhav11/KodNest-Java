
import java.util.Scanner;

class Student {

    int id;
    String name;
    double Percentage;

    void display() {
        System.out.println(id + " - " + name + " - " + Percentage);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1.Percentage = scanner.nextDouble();

        Student s2 = new Student();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2.Percentage = scanner.nextDouble();

        int selectedid = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        if (s1.id == selectedid) {
            selectedStudent = s1;
        } else if (s2.id == selectedid) {
            selectedStudent = s2;
        }

        if (selectedStudent != null) {
            selectedStudent.Percentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        s1.display();
        s2.display();

        scanner.close();
    }
}
