import java.util.stream.IntStream;

public class Parallel {
    Parallel(){
        IntStream num = IntStream.range(1, 10);
        num.parallel().forEach(System.out::println);
    }
}
