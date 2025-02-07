import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Testing =)

        String s = "a";


        System.out.println(Optional.of(s)
                .filter(s1 -> s1.startsWith("a"))
                .map(String::toUpperCase)
                .or(() -> getString().describeConstable()));
    }

    private static String getString() {
        System.out.println("I am passing here");
        return "trouxa";
    }
}