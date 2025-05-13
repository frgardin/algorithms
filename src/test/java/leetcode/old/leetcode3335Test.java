package leetcode.old;

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

}