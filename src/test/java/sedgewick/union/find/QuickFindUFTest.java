package sedgewick.union.find;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuickFindUFTest {

    private static final int N = 10;
    private static UF quickFindUF;

    @BeforeEach
    void setUp() {
        quickFindUF = new QuickFindUF(N);
    }


    @Test
    void shouldReturn2Components() {
        //given
        quickFindUF.union(4, 3);
        quickFindUF.union(3, 8);
        quickFindUF.union(6, 5);
        quickFindUF.union(9, 4);
        quickFindUF.union(2, 1);
        quickFindUF.union(5, 0);
        quickFindUF.union(7, 2);
        quickFindUF.union(6, 1);

        //when
        int result = quickFindUF.count();

        //then
        assertEquals(2, result);
    }
}