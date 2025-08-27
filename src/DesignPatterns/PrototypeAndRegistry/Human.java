package DesignPatterns.PrototypeAndRegistry;

public class Human implements Prototype<Human>
{
    private String name;
    private String color;
    private int intelligence;

    public Human(String name, String color, int intelligence) {
        this.name = name;
        this.color = color;
        this.intelligence = intelligence;
    }

    public Human(Human other)
    {
        this.name = other.name;
        this.color = other.color;
        this.intelligence = other.intelligence;
    }

    @Override
    public Human copy()
    {
        return new Human(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", intelligence=" + intelligence +
                '}';
    }
}
