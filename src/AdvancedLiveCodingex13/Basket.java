package AdvancedLiveCodingex13;

import java.io.Closeable;
import java.io.IOException;

public class Basket implements Closeable {
    private int numberOfElements;

    private final static int MIN = 0;

    private final static int MAX = 10;


    public void addToBasket() throws BasketFullException {
        if (numberOfElements >= MAX) {
            throw new BasketFullException("Basket is already full");
        }
        numberOfElements++;
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (numberOfElements <= MIN) {
            throw new BasketEmptyException("Basket is already empty");
        } else {
            numberOfElements--;
        }
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public void close() throws IOException {
        numberOfElements=0;
        System.out.println("Basket closed");
    }
}
