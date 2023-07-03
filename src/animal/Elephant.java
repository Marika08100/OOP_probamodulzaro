package animal;

import java.util.List;

public class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant sound.");

    }

    @Override
    public String toString() {
     return "Elephant:name=" + getName() + ", nicknames=" + getNicknames() + ".";
    }
}
