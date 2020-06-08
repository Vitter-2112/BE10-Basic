import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
//Given an integer, return a power of integer: 5 -> 25
        Function <Integer, Integer> f1= t ->t*t;
        System.out.println(f1.apply(15));

//Given a string, return modulo 2 of string length: "abcde" -> 1
        Function <String, Integer> f2= g ->g.length()%2;
        System.out.println(f2.apply("sdfgh"));

//Given a string, return its in upper case: "ivan" -> "IVAN"
        Function <String, String> f3= g ->g.toUpperCase();
        System.out.println(f3.apply("sdfgh"));

        //return a date of one week prior to today
        Supplier<LocalDate> s = ()-> LocalDate.now().minusDays(7);
        System.out.println(s.get());

        //Return a random number
       // Supplier <Random> s1 = ()-> s1.get(Math.random());
       // System.out.println(s1.get());

        //Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
        Predicate <Integer>p1= i -> i%2==0;
        System.out.println(p1.test (23));

        //Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
        Predicate <String>p2= i -> i.length()>2;
        System.out.println(p2.test ("asa"));

        // Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
        BiPredicate<String, Integer> bi = (x, y) -> x.length() > y;
        System.out.println(bi.test("asdfg", 3));

        //Print a given string


        ;
    }


}
