package StreamApiPrograms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class CreateStreamDemo {
	public static void main(String[] args) {
        // From Collection
        List<String> names = Arrays.asList("Uma", "mahesh", "Sathu", "Vedha");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);

        // From Array
        Stream<Integer> numberStream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});
        numberStream.forEach(System.out::println);

        // Using Stream.of()
        Stream<String> langStream = Stream.of("Java", "Python", "C++");
        langStream.forEach(System.out::println);
    }
}
