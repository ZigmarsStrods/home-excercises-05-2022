package io.codelex.classesandobjects.practice.exercise7;

public class Dog {

    private String name;
    private String sex;

    private Dog mother;
    private Dog father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setMother(Dog mother) {
        this.mother = mother;
    }

    public void setFather(Dog father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father.name;
        }
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        return mother.name.equals(otherDog.mother.name);

    }
}
