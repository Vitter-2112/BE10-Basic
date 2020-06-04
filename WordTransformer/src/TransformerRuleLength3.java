import java.util.function.Function;
import java.util.function.Predicate;

public class TransformerRuleLength3  {
    //no fields no state
//Predicate <Integer>p= i -> i>0;
    //Predicate<String> check =input -> input.length()==3;

    Predicate<String> check = input -> input.length()==3;

Function <String, String> action = input->input.toUpperCase();

//public String action (String input){
        //return (input.toUpperCase());}
}


