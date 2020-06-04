import java.util.function.Function;
import java.util.function.Predicate;

public class WordTransformer {
    //"aaa bsde eklmn xyzr"->"AAA bsde eklmn xyzr"
    //length==3; toUpperCase
    public static String transform (String input,  Predicate<String> check, Function<String, String> action ){
        String[]words=input.split(" ");

        for (int i = 0; i <words.length; i++){
            String word=words [i];
            if (check.test("aaa bsd eklmn xyzr")){
                words [i]= action.apply("aaa bsd eklmn xyzr");
            }
        }

        return String.join(" ", words);
    }
    public static String transform (String input){ return action.apply ( );
    }



    public static void main(String[] args) {


        String UpperCase = transform ("aaa bsd eklmn xyzr ", new TransformerRuleLength3());
        System.out.println(UpperCase);

        //String LowerCase = transform ("aaa bsdeff ekMNV xyzrg ", new TransformerRuleLength5());
       // System.out.println(LowerCase);

    }}


