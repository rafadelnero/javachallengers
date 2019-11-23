package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SuppressWarnings(value = "all")
public class GenericsChallenge3 {

    public static void main(String... doYourBest) {
        List<String> firstResult =  GenericsChallenge3.<String>get
                (new ArrayList<>(), new String("1"));

        List<Object> secondResult = GenericsChallenge3.
                get("Homer", Double.valueOf("4"));

        Stream<Object> stream = Stream.concat(firstResult.stream(),
                secondResult.stream());
        stream.forEach(System.out::println);
    }

    public static <T> List<T> get(List<T> list, T t) {
        list.add(t);
        return list;
    }

    public static <T, R extends T> List<T> get(T type1, R type2) {
        List<T> list = new ArrayList<>();
        list.add(type1);
        list.add(type2);
        return list;
    }
}
