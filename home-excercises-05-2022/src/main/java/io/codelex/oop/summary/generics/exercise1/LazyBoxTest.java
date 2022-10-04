package io.codelex.oop.summary.generics.exercise1;

public class LazyBoxTest {

    public static void main(String[] args) {

        //LazyBox<Integer> box = new LazyBox<>(MainProgram::calculate);

        //First time calling get - it should calculate the value
        //Integer contents = box.get();

        //Second time calling get - it should just return previously calculated value and not calculate again
        //Integer contents2 = box.get();
    }

    public static Integer calculate() {
        return 200;
    }
}
