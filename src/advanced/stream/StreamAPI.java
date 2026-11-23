package src.advanced.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/** <h3> STREAM
 *
 * <p> it needs a SOURCE: array, collection, generated,
 * have intermediate operation and terminal operation,
 * work with pipeline, applying methods to manipulate datas,
 * it is executed when the stream is terminated,
 * each intermediate operation (they return an stream) create a new stream,
 * </p>
 *
 * <p>it have LongStream, IntStream, DoubleStream</p>
 *
 * <h4> INTERMEDIATE OPERATIONS
 * <ul>
 *     <li>{@code filter()}: Filter elements</li>
 *     <li>{@code map()}: Transform elements </li>
 *     <li>{@code flatMap()}: Transform and flat elements </li>
 *     <li>{@code distinct()}: Remove duplicated elements </li>
 *     <li>{@code sorted()}: Sort elements </li>
 *     <li>{@code limit()}: Set a limit</li>
 *     <li>{@code skip()}: Skip an element</li>
 *     <li>{@code peek()}: Follow an element while processing</li>
 * </ul>
 *
 * <h4> TERMINAL OPERATIONS
 * <ul>
 *      <li>{@code collect()}: Colect an element with a Collection</li>
 *      <li>{@code toList()}: Convert to list </li>
 *      <li>{@code forEach()}: Iterate elements </li>
 *      <li>{@code count()}: Count elements </li>
 *      <li>{@code min()}: Return max value </li>
 *      <li>{@code max()}: Return min value </li>
 *      <li>{@code reduce()}: Reduce elements in one element</li>
 *      <li>{@code anyMatch()}: Check if an element is match</li>
 *      <li>{@code allMatch()}: Check it all elements is match</li>
 *      <li>{@code noneMatch()}: Check if none element is match</li>
 *      <li>{@code findFirst()}: Return first element</li>
 *      <li>{@code findAny()}: Return some element</li>
 * </ul>
 * <p>OBS.: Return Optional<T> to elements </p>
 *
 */
public class StreamAPI {

    public static void main(String[] args) {

        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);

        /// create a stream
        Stream<String> s1 = Stream.of(array);
        Stream<String> s2 = Arrays.stream(array);
        Stream<String> s3 = list.stream();
        Stream<Integer> s4 = Stream.generate(() -> 10).limit(2); // {10, 10}

        /// to interate using forEach
        s1.forEach(System.out::print);

        /// channing
        s2
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s))
        ;

        ///  convert to primitive type (int)
        int[] arr = s4
                .mapToInt(i -> i)
                .toArray();

        ///  convert to stream (Integer) - use boxed()
        List<Integer> lst = Arrays.stream(arr).boxed().toList();

    }


}
