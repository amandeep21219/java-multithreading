import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int res = list.stream()
                .filter(n -> n % 2 == 0)  
                .sorted()                 
                .map(n -> n * 2)          
                .reduce(0, (c, d) -> c + d); 

        System.out.println( res);
    
    Stream<Integer> data = list.stream();

    
    Stream<Integer> filteredData = data.filter(n -> n % 2 == 0);

    
    Stream<Integer> sortedData = filteredData.sorted();

    
    Stream<Integer> mappedData = sortedData.map(n -> n * 2);

    
    long count = mappedData.count();  

    
    Stream<Integer> finalStream = list.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .map(n -> n * 2);

  
    int sum = finalStream.reduce(0, Integer::sum);//substitute for lambda expression (c, d) -> c + d

    System.out.println("Total Count: " + count);
    System.out.println("Sum of doubled even numbers: " + sum);

    
    list.stream()
        .filter(n -> n % 2 == 0)
        .sorted()
        .map(n -> n * 2)
        .forEach(n -> System.out.print(n + " "));  

    System.out.println();
}
}
