import java.util.Arrays;

public class Reduce {
    Reduce(){
        int[] ar = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i : ar) sum += i;
        // OR
        // Reduce method
        int sum1 = Arrays.stream(ar).reduce(0,(x, y) -> x+y);
        int sum2 = Arrays.stream(ar).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
