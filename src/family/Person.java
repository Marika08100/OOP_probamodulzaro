package family;

public class Person {
    private final String name;
    private Person father;
    private Person mother;
    private final int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void printFamilyTree(){
        System.out.print("Anyai csaladfa: ");
        printFamilyMotherTree();

        System.out.print("Apai csaladfa: ");
        printFamilyFatherTree();
    }

    public void printFamilyMotherTree() {
        if (mother == null) {
            System.out.println(name + " - ");
        } else {
            System.out.println(mother.getName() + " " + father.getName());
            mother.printFamilyMotherTree();
        }

    }
    public void printFamilyFatherTree() {
        if(father == null){
            System.out.println(getName() + " - ");
        }else{
            System.out.println(father.getName() + " " + mother.getName());
            father.printFamilyFatherTree();
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", father=" + father +
                ", mother=" + mother +
                ", birthYear=" + birthYear +
                '}';
    }
}
