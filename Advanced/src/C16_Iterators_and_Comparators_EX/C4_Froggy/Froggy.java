package C16_Iterators_and_Comparators_EX.C4_Froggy;

import java.util.Arrays;
import java.util.Iterator;

public class Froggy implements Iterable<Integer>{
    public int[] stones;

    public Froggy(int[] stones) {

        this.stones = stones;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer> () {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return this.index < stones.length;
            }
            @Override
            public Integer next() {
                int element = stones[this.index];
                if(stones.length %2 == 0){
                if(this.index == stones.length - 2){
                    this.index = -1;
                  }
                }
                else {
                    if(this.index == stones.length - 1 ){
                        this.index = -1;
                    }
                }
                this.index += 2;
                return element;
            }
        };
    }
}