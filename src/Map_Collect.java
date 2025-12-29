import java.util.Arrays;
import java.util.List;

public class Map_Collect {
    Map_Collect(){
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = l1.stream().map(x->x*x).toList();
        for(Integer i : l2) System.out.println(i);
    }
}
