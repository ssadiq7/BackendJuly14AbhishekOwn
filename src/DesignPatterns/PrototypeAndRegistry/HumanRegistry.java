package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class HumanRegistry
{
    Map<RaceType, Human> humans = new HashMap<>();

    public HumanRegistry()
    {
        Human human1 = new Human("PrototypeElf", "Fair", 90);
        Human human2 = new Human("PrototypeOrc", "Green", 20);
        Human human3 = new Human("PrototypeZombie", "Pale", -10);

        humans.put(RaceType.Elf, human1);
        humans.put(RaceType.Orc, human2);
        humans.put(RaceType.Zombie, human3);
    }

    public void add(RaceType key, Human human)
    {
        humans.put(key, human);
    }

    public Human get(RaceType key)
    {
        Human prototype = humans.get(key);
        if (prototype == null)
        {
            throw new IllegalArgumentException("Human type does not exist");
        }

        return prototype.copy();
    }
}
