package IteratorShablon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;
    
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandom(int min, int max) {
        random = new Random();
        int diff = max - min;
        int randomNumber;
        randomNumber = random.nextInt(diff + 1);
        return randomNumber + min;
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
                index++;
                return getRandom(min, max);
            }
        };
    }


}
