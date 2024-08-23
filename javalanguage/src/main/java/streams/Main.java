package streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //StreamsDemo.slicingStream();
        //question1();
        //question1WithMap();
        //question8();
        int x = 10;
        Runnable r = () -> System.out.println(x);
        Thread t = new Thread(r);
        t.start();
        String s = "";

    }
    //Data -> Method1 -> Method2 -> Method3
    //Method3 is terminal whiere steam ends . Method1 and 2 are intermediate operations
    //Number of elements don't change but each element change => Mapping
    //Number of elements change but element do not change => Filtering

    static void question1() {
        //Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(value -> System.out.println(value * value));
    }
    static void question1WithMap() {
        //Find below a list of integers. Iterate over it and print the square of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .map(value-> value*value)
                .forEach(System.out::println);
    }
    static void question2(){
        //Find below a list of integers. Iterate over it and print every even number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }

    static List<Integer> question4(){
        //For a list of integers, return a list of the squares of each number.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return numbers.stream()
                .map(value -> value * value)
                .toList();
    }

    static List<Integer> question3(){
        //For a list of integers, find a list of the even numbers and return square
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return numbers.stream()
                .filter(value -> value % 2 == 0)
                .map(value -> value * value)
                .toList();
    }

    static int question8() {
        //sum
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .reduce(0, (currSum, currElem) -> {
                    System.out.println(currSum + "-----" + currElem);
                    return currElem + currSum;
                });
        System.out.println(sum);
        return sum;
    }
//Accumulator -> currElem, currValue
//[1,2,3,4]
// currVal = 0
//currElem = 1
// return 0+1
//return 1+2
//return 3+3

}
