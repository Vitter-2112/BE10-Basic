import java.util.*;

public class Duplicates {

   public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();
    list.add(-8);
    list.add(1);
    list.add(-5);
    list.add(1);
    list.add(2);
    list.add(7);

    Set<Integer> set = new HashSet<>();
    set.addAll(list);
    for(Integer a:list){
        if(set.contains(a)){
            set.remove(a);
        }else{
            duplicates.add(a);
        }
    }
    System.out.println(duplicates);
}}
