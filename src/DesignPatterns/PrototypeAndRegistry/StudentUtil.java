package DesignPatterns.PrototypeAndRegistry;

public class StudentUtil
{
    public static void doCopy(Student student)
    {
        Student copyStudent = student.copy();
        System.out.println(copyStudent.getName());
    }
}
