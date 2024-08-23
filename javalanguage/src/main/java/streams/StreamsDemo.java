package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    static List<Movie> movies = List.of(
            new Movie("a",10),
            new Movie("b",20),
            new Movie("c",40),
            new Movie("d",30)
    );
    public static void show(){

        //Imperative
        int count = 0;
        for(var movie : movies){
            if(movie.getLikes() > 10)
                count++;
        }

        //Declarative or Functional Programming
        //Strams in Java -> To process a collection ofa data in declarative way
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();

    }

    public  static void generateStreams(){
        var list = new ArrayList<>();
        int[] nums = {1,2,3,3};
        Arrays.stream(nums)
                .forEach(item-> System.out.println(item));

        //another way
        Stream.of(1,2,3,34,4);
    }

    public static void infiniteSteams(){
        //infinite steams
        var rands = Stream.generate(()-> Math.random());
        rands.limit(100)
                .forEach(item -> System.out.println(item));

    }
    public static void infiniteSteams2(){
        Stream.iterate(1,n->n*2)
                .limit(12)
                .forEach(item-> System.out.println(item));
    }

    public static void mapSteams(){
        movies.stream()
                .map(Movie::getTitle) //mapToInt etc
                .forEach(System.out::println);
    }

    public static void flatMapStream(){
        var steam = Stream.of(List.of(1,2,3,3),List.of(7,3,45,5));
        //steam.forEach(list -> System.out.println(list));
        steam.flatMap(list -> list.stream())
                .forEach(item -> System.out.println(item));
    }

    public static void slicingStream(){
        movies.stream()
                //.limit(2) //.skip(2)
                .takeWhile(m -> m.getLikes() < 30) //as soon it finds first match
                .forEach(item-> System.out.println(item));

        movies.stream()
                .sorted((a,b)-> a.getTitle().compareTo(b.getTitle())) //1
                .sorted(Comparator.comparing(Movie::getTitle).reversed()) //2 same as 1
                .forEach(item-> System.out.println(item));

        //distinct
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        //peek
        movies.stream()
                .map(Movie::getLikes)
                .peek(System.out::println)// helps in debugging , print after each operation
                .distinct()
                .forEach(System.out::println);

    }

    public  static void reducers(){
        movies.stream()
                .anyMatch(m->m.getLikes() > 20); // allMatch, nonMatch, findFirst( return Optional<Movie>

        movies.stream()
                .map(Movie::getLikes)
                .reduce((a,b) -> a + b)
                .orElse(0);

    }

    public static  void demoCollectors(){
        var result = movies.stream()
                .filter(m-> m.getLikes()> 10)
                .collect(Collectors.toSet()); //toList()

        var resultMap = movies.stream()
                .filter(m-> m.getLikes()> 10)
                .collect(Collectors.toMap(Movie::getTitle,Movie::getLikes));//(m->m) is Function.identity()

        var summerize = movies.stream()
                .filter(m-> m.getLikes()> 10)
                .collect(Collectors.summarizingInt(Movie::getLikes)); //count, sum , min, mix
        //Groupings
        //PartitionBy

    }

}
