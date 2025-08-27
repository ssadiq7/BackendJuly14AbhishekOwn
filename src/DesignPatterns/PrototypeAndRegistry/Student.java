package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>
{
    private String name;
    private int age;
    private double psp;

    public Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    //Copy constructor
    public Student(Student other)
    {
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
    }

    public Student copy()
    {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }
}
