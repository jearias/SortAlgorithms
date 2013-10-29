package jearias.katas.algorithm.sort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import jearias.katas.algorithm.sort.DutchFlagOrder;

import org.junit.Test;

public class DutchFlagOrderTest {

    @Test
    public void testDutchFlagSort() {
        int[] chain = { 3, 6, 12, 9, 23, 7, 15, 2, 4, 0 };
        int[] orderedChain = { 3, 0, 2, 9, 4, 7, 6, 15, 23, 12 };
        System.out.println("start: " + Arrays.toString(chain));
        DutchFlagOrder.dutchFlagSort(chain, 4, 10);
        System.out.println("end: " + Arrays.toString(chain));
        assertThat(chain, equalTo(orderedChain));

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