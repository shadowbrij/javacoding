import java.util.*;

public class priorityQueue {

    public static void main(String[] args)

    {

        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(123, "Alex");

        employeeMap.put(342, "Ryan");

        employeeMap.put(143, "Joe");

        employeeMap.put(234, "Allen");

        employeeMap.put(432, "Roy");



        TreeMap<Integer, String> sortedMap = new TreeMap<>();

        sortedMap.putAll(employeeMap);

        System.out.println("Sorted map " + sortedMap);

    }

}