package io.codelex.secondT.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<E> {

    private int count = 0;
    List<E> contents;

    public Basket() {
        contents = new ArrayList<>();
    }

    public void addToBasket(E element) {
        if (count == 10) {
            throw new BasketFullException("Basket is full :(");
        } else {
            contents.add(element);
            count++;
        }
    }

    public void removeFromBasket() {
        if (count == 0) {
            throw new BasketEmptyException("Basket is empty :(");
        } else {
            contents.remove(contents.size() - 1);
            count--;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<E> getContents() {
        return contents;
    }
}
