package best.dima.sandbox.basics.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {

    // ---- LAMBDA EXPRESSIONS ----
    // Lambda expressions are functions that
    // can be passed as if they are objects
    public void run() {
        System.out.printf("\n### %s\n", LambdaExpressions.class.getSimpleName());

        ArrayList<Integer> oneTo5 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // Multiply each value by 2
        oneTo5.forEach(x -> System.out.println(x*2));

        // Print only evens
        oneTo5.forEach(x -> { if (x%2 == 0) System.out.println(x); });

        // Generate Fibonacci numbers
        List<Integer> fib = new LinkedList<>();

        // iterate creates an infinite stream starting
        // with 0, 1 as we define and then create the next
        // value by adding the previous 2
        // We limit to 10 results
        // map stores the result
        // collect process the list elements into a
        // container
        fib = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .map(n -> n[0])
                .collect(Collectors.toList());
        fib.forEach(x -> System.out.println(x));

    }
}
