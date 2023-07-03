package family;

public class Main {
    public static void main(String[] args) {


        Person alma = new Person("Alma");
        Person bela = new Person("Bela");
        Person cecil = new Person("Cecil");
        Person denes = new Person("Denes");
        Person emoke = new Person("Emoke");
        Person ferenc = new Person("Ferenc");
        Person gyongyi = new Person("Gyongyi");

        alma.setFather(bela);
        alma.setMother(cecil);
        cecil.setFather(denes);
        cecil.setMother(emoke);
        emoke.setFather(ferenc);
        emoke.setMother(gyongyi);

        System.out.println(alma.getFamilyTree());

        Person marika = new Person("Marika");
        Person janos = new Person("Janos");
        Person erika = new Person("Erika");
        Person maria = new Person("Maria");
        Person sandor = new Person("Sandor");
        marika.setMother(erika);
        marika.setFather(janos);
        erika.setFather(sandor);
        erika.setMother(maria);

        System.out.println(marika.getFamilyTree());

    }
}
