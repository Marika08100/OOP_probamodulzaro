package animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private final String name;
    private List<String> nicknames;

    public Animal(String name) {
        this.name = name;
        this.nicknames = new ArrayList<>();
    }
    public abstract void makeSound();

    public String getName() {
        return this.name;
    }

    public void addNicknames(String nickName) {
        this.nicknames.add(nickName);
    }

    public List<String> getNicknames() {
        return this.nicknames;
    }


    @Override
    public String toString() {
        return "Animal:" +
                "name='" + name +
                ", nicknames=" + nicknames + ".";
    }
}
