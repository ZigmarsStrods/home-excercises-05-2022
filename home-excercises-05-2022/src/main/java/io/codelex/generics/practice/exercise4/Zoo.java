package io.codelex.generics.practice.exercise4;

class Zoo {
    void feedAnimal(Cage cage) {
        feed(cage.getAnimal().lunchBag, cage.getAnimal());
    }

    <F extends Food> void feed(F food, Animal<F> animal) {
        animal.eat(food);
    }

    void manage() {
        Sheep mySheep = new Sheep();
        Cage<Food> myCage = new Cage<>(mySheep);
        feedAnimal(myCage);
        Wolf myWolf = new Wolf();
        //mySheep.eat(myWolf);


    }
}
