package io.codelex.secondT.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    void checkifPossibleToAddApple() {

        Basket<Apple> myBasket = new Basket<>();
        Apple myApple = new Apple();
        myBasket.addToBasket(myApple);
        Assertions.assertEquals(1, myBasket.getCount());

    }

    @Test
    void testEmptyBasketException() {

        Basket<Apple> myBasket = new Basket<>();
        BasketEmptyException error = Assertions.assertThrows(BasketEmptyException.class, myBasket::removeFromBasket);
        Assertions.assertEquals("Basket is empty :(", error.getMessage());
    }

    @Test
    void checkifPossibleToAddMushroom() {

        Basket<Mushroom> myBasket = new Basket<>();
        Mushroom myMushroom = new Mushroom();
        myBasket.addToBasket(myMushroom);
        Assertions.assertEquals(1, myBasket.getCount());

    }

    @Test
    void testFullBasketException() {

        Basket<Mushroom> myBasket = new Basket<>();
        Mushroom myMushroom = new Mushroom();
        myBasket.setCount(10);
        BasketFullException error = Assertions.assertThrows(BasketFullException.class, () -> myBasket.addToBasket(myMushroom));
        Assertions.assertEquals("Basket is full :(", error.getMessage());
    }

}
