




import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.TestNGAntTask.Mode.junit;

public class WordTransformerTest {
    @Test
            public void testTransform(){
//Testdata
        String input="aaa bsde eklmn xyz";

        //Call o method, we test with test data
    String actual= WordTransformer.transform(input) ;

    //expected result
String expected ="AAA bsde eklmn XYZ";

//compare actual and expected
        assertEquals(actual.length(),input.length());
        assertEquals(expected, actual);
        System.out.println(actual);

    }}
/*  @Test
    public void testTransformRule5(){
//Testdata
        String input="aaa bsde eklMN xyz";
        //Call o method, we test with test data
        String actual= WordTransformer.transform(input, new TransformerRuleLength5()) ;
        //expected result
        String expected ="aaa bsde eklmn xyz";
//compare actual and expected
        assertEquals(actual.length(),input.length());
        assertEquals(expected, actual);
        System.out.println(actual);}} */

