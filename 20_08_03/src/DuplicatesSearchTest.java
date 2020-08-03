import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesSearchTest {
    DuplicatesSearch search= new DuplicatesSearch();


    @Test
    public void testDuplicatesSearch_1unpaired_1unpaired (){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);

       assertEquals(1, search.withoutPair(list));


    }

    @Test
    public void testDuplicatesSearch_0unpaired_0unpaired (){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);

        assertEquals(0, search.withoutPair(list));}

        @Test
        public void testDuplicatesSearch_EmptyList_0unpaired (){

            LinkedList<Integer> list = new LinkedList<>();


            assertEquals(0, search.withoutPair(list));

    }

   /* @Test
    public void testDuplicatesSearch_3unpaired_3unpaired (){

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(7);

        assertEquals(3, search.withoutPair(list));}*/
}