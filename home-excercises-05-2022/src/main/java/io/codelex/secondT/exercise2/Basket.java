package io.codelex.secondT.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<E> {
    List<E> contents;

    public Basket() {
        contents = new ArrayList<>();
    }

    public void addToBasket(E element) {
        if (contents.size() == 10) {
            throw new BasketFullException("Basket is full :(");
        }
        contents.add(element);
    }

    public void removeFromBasket() {
        if (contents.size() == 0) {
            throw new BasketEmptyException("Basket is empty :(");
        }
        contents.remove(contents.size() - 1);
    }

    public List<E> getContents() {
        return contents;
    }

    public int getCount() {
        return contents.size();
    }
}
