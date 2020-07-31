import java.util.Arrays;
import java.util.List;

public class MultipliersSearcher {

    public static void main(String[] args) {
        int N=33;
        List<Integer> list = Arrays.asList(1,3,8,9,9,11,20);

        //public boolean isDivisor(list int N){
        for (int i = 0; i <list.size()-1; i++) {
            int firstM = N % list.get(i);

            int secondM = N % firstM;
            if (firstM == 0 & secondM == 0)
                System.out.println(firstM + secondM);
        }}}

