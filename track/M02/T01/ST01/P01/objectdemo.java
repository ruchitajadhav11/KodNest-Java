
import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;
    double javaScore;
}

public class objectdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.id = sc.nextInt();
        sc.nextLine();

        s.name = sc.nextLine();
        s.course = sc.nextLine();
        s.javaScore = sc.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);

        sc.close();
    }
}
