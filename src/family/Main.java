package family;

public class Main {
    public static void main(String[] args) {

        Person alma = new Person("Alma" );
        Person bela = new Person("Béla");
        Person cecil = new Person("Cecil");
        Person denes = new Person("Dénes");
        Person emoke = new Person("Emőke");
        Person ferenc = new Person("Ferenc");
        Person gyongyi = new Person("Gyöngyi");

        alma.setFather(bela);
        alma.setMother(cecil);
        bela.setFather(cecil);
        bela.setMother(cecil);
        cecil.setFather(denes);
        cecil.setMother(emoke);
        emoke.setFather(ferenc);
        emoke.setMother(gyongyi);


        System.out.println(alma.getFamilyTree());

    }
}
