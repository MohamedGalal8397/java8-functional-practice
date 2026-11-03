package org.example;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {


        // Functional interface + lambda expression
        System.out.println("using functional interface : ");
        FirstFunctionalInterface firstFunctionalInterface = (x , y ) -> {return x+y ;};
      int z =  firstFunctionalInterface.add( +5,6);
        System.out.println("Sum = "+z);
        System.out.println("______________________________________");


        List<String> names = Arrays.asList( "Mohamed" ,"Mona", "Hossam" , "Ahmed");
        System.out.println("name starts with M and ends with a : ");
        names.stream()
                .filter( (name) -> {
                    return  name.startsWith("M");
                })
                .filter((name) -> name.endsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("______________________________________");


        System.out.println("Sorting names in reverse direction : ");
        names.stream().
                sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("______________________________________");




        System.out.println(" square of number List : ");
        List<Integer> number = Arrays.asList( 2,3,4,5,6,7 ,8 , 9 );

        // Stream (map + collect)
       List<Integer> result = number.stream()
                .map((x) ->  x*x )
                .collect(Collectors.toList())  ;

        System.out.println(result);
        System.out.println("______________________________________");

        System.out.println(" sum List : ");
        // steam (reduce)
        int sum = number.stream()
                .reduce(0 , (a,b) -> a+b);
        System.out.println("SUM = "+sum);
        System.out.println("______________________________________");
        System.out.println(" max Number of list : ");
        int maxNumber = number.stream()
                .reduce(Integer::max)
                .get();
        System.out.println(maxNumber);

        System.out.println("______________________________________");
        System.out.println("Applying default method in interface : ");
        CatInterface catInterface = new Animal();
        catInterface.getCat();

        System.out.println("______________________________________");
        System.out.println("using static import");
        System.out.println(sqrt(25));

        System.out.println("______________________________________");


    }
}