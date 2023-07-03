package animal;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Circus circus = new Circus();

        Elephant elephant = new Elephant("Dumbo");
        elephant.addNicknames("BABA");
        elephant.addNicknames("Lola");
        circus.addAnimal(elephant);

        Lion lion = new Lion("Macsek");
        lion.addNicknames("Kiscica");
        lion.addNicknames("Nagymacska");
        circus.addAnimal(lion);

        Seal seal = new Seal("Salty");
        seal.addNicknames("fokacska");
        seal.addNicknames("tengeriHal");
        seal.addNicknames("bby");
        circus.addAnimal(seal);
        System.out.println(seal.toString());

        System.out.println("Number of animals : " + circus.getNumberOfAnimals());

        circus.printAllNickNames();

    }


}
