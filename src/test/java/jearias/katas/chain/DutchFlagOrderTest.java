package jearias.katas.chain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import jearias.katas.algorithm.sort.DutchFlagOrder;

import org.junit.Test;

public class DutchFlagOrderTest {

    @Test
    public void testDutchFlagSort() {
        int[] chain = { 2, 25, 3, 6, 8, 9, 1, 12, 43, 2, 4, 0 };
        System.out.println("start: " + Arrays.toString(chain));
        DutchFlagOrder.dutchFlagSort(chain, 4, 10);
        System.out.println("end: " + Arrays.toString(chain));

    }

    @Test
    public void testDutchFlagSortWithStrings() {
        String chain = "M00bb33L";
        String orderedChain = "ML0033bb";
        System.out.println("start: " + chain);
        chain = DutchFlagOrder.dutchFlagSortWithStrings(chain);
        System.out.println("end: " + chain);

        assertThat(chain, equalTo(orderedChain));
    }

}