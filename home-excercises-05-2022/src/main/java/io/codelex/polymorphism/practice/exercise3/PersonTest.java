package io.codelex.polymorphism.practice.exercise3;

public class PersonTest {

    public static void main(String[] args) {
        Employee me = new Employee("Green", "Lantern", "Saturn", 1, "Occasional superhero");
        me.display();
        Student anotherMe = new Student("Klara", "Kent", "Cripto", 2, 200.12);
        anotherMe.display();
    }
}
