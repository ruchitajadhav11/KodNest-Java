
class student {

    String name;
    int age;
    double height;

    // Default constructor
    student() {
        name = "anu";
        age = 19;
        height = 5.0;
    }

    // Parameterized constructor - one parameter
    student(String name) {
        this.name = name;
    }

    // Parameterized constructor - three parameters
    student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class constructor_types {

    public static void main(String[] args) {

        student s3 = new student();
        s3.display();

        student s1 = new student("raja", 18, 5.5);
        s1.display();

        student s2 = new student("alice");
        s2.display();
    }
}
