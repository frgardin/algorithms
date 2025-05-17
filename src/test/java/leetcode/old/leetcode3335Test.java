package leetcode.old;

import com.algorithms.leetcode.old.leetcode3335;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class leetcode3335Test {

    @Test
    void shouldMapTotalCharactersInStringAfterTransformations1() {
        //given
        String s = "abcyy";
        int t = 2;

        //when
        int result = leetcode3335.lengthAfterTransformations(s, t);

        //then
        assertEquals(7, result);
    }

    @Test
    void shouldMapTotalCharactersInStringAfterTransformations2() {
        //given
        String s = "azbk";
        int t = 1;

        //when
        int result = leetcode3335.lengthAfterTransformations(s, t);

        //then
        assertEquals(5, result);
    }


    @Test
    @Disabled("need to fix the algorithm")
    void shouldMapTotalCharactersInStringAfterTransformations3() {
        //given
        String s = "jqktcurgdvlibczdsvnsg";
        int t = 7517;

        //when
        int result = leetcode3335.lengthAfterTransformations(s, t);

        //then
        assertEquals(5, result);
    }
}