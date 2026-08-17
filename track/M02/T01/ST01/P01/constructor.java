
class Student {

    String name;
    int age;
    double height;

    Student(String name, int age, double height) {
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

public class constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Rani", 19, 4.5);//constructor call
        s1.display();//display method call
    }
}
