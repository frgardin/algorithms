package leetcode.old;

import com.algorithms.leetcode.old.leetcode1550;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1550Test {

    @Test
    void shouldReturnFalseForNoOddThreeSequence() {
        //given
        int[] arr = new int[]{2, 6, 4, 1};

        //when
        boolean result = leetcode1550.threeConsecutiveOdds(arr);

        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueForOddThreeSequence() {
        //given
        int[] arr = new int[]{1,2,34,3,4,5,7,23,12};

        //when
        boolean result = leetcode1550.threeConsecutiveOdds(arr);

        //then
        assertTrue(result);
    }

}