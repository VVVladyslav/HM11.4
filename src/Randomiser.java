import java.util.stream.Stream;

public class Randomiser {

    public static Stream<Long> infinity (long seed, long a, long c, long m){

        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
