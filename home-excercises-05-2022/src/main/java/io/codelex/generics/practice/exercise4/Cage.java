package io.codelex.generics.practice.exercise4;

class Cage <F extends Food>{

    Animal<F> animal;

        Cage(Animal<F> animal){
        this.animal=animal;
        }

        Animal<F> getAnimal(){
        return animal;
        }
        }
