import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        long a = 25214903917l;
        long c = 11l;
        long m = 2^48l;

        Stream<Long> res = Randomiser.infinity(1, a, c, m);
                 res
                .limit(20)
                .forEach(System.out::println);
    }
}