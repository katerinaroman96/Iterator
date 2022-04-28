package IteratorShablon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    List<Integer> list = new ArrayList<>();
    public Randoms(int min, int max) {
        getRandom(min, max);
    }

    public void getRandom(int min, int max) {
        random = new Random();
        int diff = max - min;
        int randomNumber;
        randomNumber = random.nextInt(diff + 1);
        list.add(randomNumber + min);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                getRandom(10, 100);
                int test = list.get(index);
                index++;
                return test;
            }
        };
    }


}
