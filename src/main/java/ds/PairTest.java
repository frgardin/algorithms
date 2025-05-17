package ds;

import java.util.AbstractMap;
import java.util.Map;

public class PairTest {

    public static void main(String[] args) {
        //java 8 way
        Map.Entry<Integer, Integer> p = new AbstractMap.SimpleEntry<>(1, 2);

        //java 21 way
        Map.Entry<Integer, Integer> entry = Map.entry(1, 2);

        System.out.println("p.getKey() = " + p.getKey());
        System.out.println("p.getValue() = " + p.getValue());
    }
}
