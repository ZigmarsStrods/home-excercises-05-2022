package io.codelex.generics.practice.exercise4;

class Cage {

    Animal<? extends Food> animal;

        Cage(Animal<? extends Food> animal){
        this.animal=animal;
        }

        Animal<? extends Food> getAnimal(){
        return animal;
        }
        }
