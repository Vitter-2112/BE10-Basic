import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DuplicatesSearch {

    //LinkedList<Integer>list=new LinkedList();
    LinkedList<Integer>list;
   int unpaired;
    public int withoutPair(LinkedList<Integer>list) {

        Map<String, Integer> counts = new HashMap<String,Integer>();
        String key;


        for ( int i : list ) {
            key = String.valueOf( i );
            if ( counts.containsKey( key ) ) {
                int count = counts.get( key );
                counts.put( key, ++count );
            }
            else {
                counts.put( key, 1 );
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() < 2) {
               entry.getKey();
                System.out.println(entry.getKey() + "has no pair");

            unpaired=entry.getValue();
            }
        }
        return unpaired;
    }}