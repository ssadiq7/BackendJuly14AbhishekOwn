package DesignPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student
{
    private int iq;

    public IntelligentStudent(String name, int age, double psp, int iq) {
        super(name, age, psp);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    public IntelligentStudent copy()
    {
        return new IntelligentStudent(this);
    }
}
