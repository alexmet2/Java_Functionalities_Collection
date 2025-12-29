public class InterpolationSearch1 {
    InterpolationSearch1(){
     /*
            Interpolation search =  Improvement over Binary Search, best used for "uniformly" distributed data
                                    "guesses" where a value might be based on calcuated probe results
                                    If probe is incorrect, search area is narrowed, and a new probe is calculated

                                    average case: 0(log(log(n)))
                                    worst case: 0(n) [values increase exponentially]
    */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        /* calls method for the interpolation search */
        int index = interpolation_search(array,8);
        /* if element is found it will return the index of the value, if it does not find it, the method is going to return -1 */
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
        System.out.println();
        System.out.println("Interpolation_Search 2");
        Interpolation_Search2();
    }
    static void Interpolation_Search2() {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        /* calls method for the interpolation search */
        int index = interpolation_search(array,512);
        /* if element is found it will return the index of the value, if it does not find it, the method is going to return -1 */
        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    static int interpolation_search(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high){

            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            /* shows the "guess" of the probe */
            System.out.println("Probe: " + probe);

            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
        }
        return -1;
    }
}
