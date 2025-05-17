package com.algorithms.old.find;

import com.algorithms.find.QuickFindUF;
import com.algorithms.find.QuickUnionTry;
import com.algorithms.find.QuickUnionUF;
import com.algorithms.find.UF;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UFTest {

    private static final int N = 10;

    @ParameterizedTest
    @MethodSource("provideUF")
    void shouldReturn2Components(UF uf) {
        //given
        uf.union(4, 3);
        uf.union(3, 8);
        uf.union(6, 5);
        uf.union(9, 4);
        uf.union(2, 1);
        uf.union(5, 0);
        uf.union(7, 2);
        uf.union(6, 1);

        //when
        int result = uf.count();

        //then
        assertEquals(2, result);
    }

    private static Stream<UF> provideUF() {
        return Stream.of(new QuickFindUF(N), new QuickUnionUF(N), new QuickUnionTry(N));
    }
}