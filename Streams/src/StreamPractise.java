import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamPractise {
    public static void main(String[] args) {
        byte var1 = -51, var2 = -28; System.out.println(var1 & var2); 
        int k = (int) Math.random();
        System.out.println(k);
        int x = 3; int y = 1; if (x == y) /* Line 3 */ { System.out.println("x =" + x); }

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(i);
        }
        Stream<Integer> sequentialStream = myList.stream();

        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); // filter numbers greater than 90
        System.out.print("High Nums greater than 90=");
        highNums.forEach(p -> System.out.print(p + " "));
        // prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names. map(String::toUpperCase).collect(Collectors.toList()));

        // prints [ABC, D, EF]

        System.out.println("Also check ordering with comparable");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 7, 1);
        System.out.println(integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println(integers.stream().mapToInt(n -> n).max().getAsInt());

        //create readonly collection
        Collections.unmodifiableCollection(integers);
        //array declaration
        Integer[] intArray = new Integer[2];

        String s = "acvctd1123";
        System.out.println(s.chars().distinct().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ));

        //factorial using stream
        System.out.println(LongStream.rangeClosed(2, 5)
                .reduce(1, (long a, long b) -> a * b));

        //remove duplicates from a list of string
        List<String> alphaList = Arrays.asList("a","b","c","d","d");
        System.out.println(alphaList.stream().collect(Collectors.toSet()));

        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.stream().map(StreamPractise::divideByZero).forEach(System.out::println);
        Boolean b = false;

    }

    public static int divideByZero(int n){
        return n/0;
    }
}
