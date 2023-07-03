package animal;

import java.util.ArrayList;
import java.util.List;

public class Circus {
    private List<Animal> animals;
    private int numberOfAnimals;

    public Circus() {
        this.animals = new ArrayList<>();
        numberOfAnimals = 0;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        numberOfAnimals++;
    }

    public void printAllNickNames() {
        for (var actual : animals) {
            System.out.println("Nicknames " + actual.getNicknames());
        }

    }

    public int getNumberOfAnimals() {
        return this.numberOfAnimals;
    }

    @Override
    public String toString() {
        return "Circus{" +
                "animals=" + animals +
                ", numberOfAnimals=" + numberOfAnimals +
                '}';
    }
}
