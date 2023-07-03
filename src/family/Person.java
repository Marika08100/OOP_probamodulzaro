package family;

public class Person {
    private final String name;
    private Person father;
    private Person mother;

    public Person(String name) {
        this.name = name;
        this.father = null;
        this.mother = null;
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

    public String getFamilyTree() {
        return buildFamilyTree();
    }

    private String buildFamilyTree() {
        String tree = name;
        if (father != null || mother != null) {
            tree += " ";
            if (father != null) {
                tree += father.buildFamilyTree();
            }
            if (mother != null) {
                tree += " - " + mother.buildFamilyTree();
            }
        }
        return tree;
    }
}
