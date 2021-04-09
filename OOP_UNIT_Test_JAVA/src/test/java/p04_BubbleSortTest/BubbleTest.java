package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

public class BubbleTest {
    @Test
    public void testSort(){
        int[] arrRandom = {8, 5, 10};
        int[] arr = {5, 8, 10};
        Bubble.sort (arrRandom);
        for (int i = 0; i < arrRandom.length; i++) {
            Assert.assertEquals (arrRandom[i], arr[i]);
        }

    }
}
