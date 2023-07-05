package family;

public class Main {
    public static void main(String[] args) {
        Person alma = new Person("Alma", 1980);
        Person bela = new Person("Béla", 1950);
        Person cecil = new Person("Cecil", 1955);
        Person denes = new Person("Dénes", 1920);
        Person emoke = new Person("Emőke", 1925);
        Person ferenc = new Person("Ferenc", 1890);
        Person gyongyi = new Person("Gyöngyi", 1895);


        alma.setFather(bela);
        alma.setMother(cecil);

        bela.setFather(denes);
        bela.setMother(emoke);

        cecil.setFather(ferenc);
        cecil.setMother(gyongyi);

        alma.printFamilyTree();


    }
}
