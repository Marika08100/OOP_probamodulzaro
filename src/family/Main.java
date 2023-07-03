package family;

public class Main {
    public static void main(String[] args) {

        Person alma = new Person("Alma");
        Person bela = new Person("Béla");
        Person cecil = new Person("Cecil");
        Person denes = new Person("Dénes");
        Person emoke = new Person("Emőke");
        Person ferenc = new Person("Ferenc");
        Person gyongyi = new Person("Gyöngyi");

        alma.setFather(bela);
        alma.setMother(cecil);
        bela.setFather(denes);
        bela.setMother(emoke);
        cecil.setFather(ferenc);
        cecil.setMother(gyongyi);

        System.out.println(alma.getFamilyTree());
    }
}
