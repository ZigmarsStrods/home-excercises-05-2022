package io.codelex.generics.practice.exercise4;

class Cage <? extends Food>{

    Animal<?> animal;

        Cage(Animal<?> animal){
        this.animal=animal;
        }

        Animal<?> getAnimal(){
        return animal;
        }
        }
