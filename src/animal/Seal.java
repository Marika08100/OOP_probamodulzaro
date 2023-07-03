package animal;

import java.util.List;

public class Seal extends Animal {
    public Seal(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Seal sound");

    }

    @Override
    public String toString() {
        return "Seal: name " + getName() + " ,nicknames" + getNicknames() + ".";
    }
}
