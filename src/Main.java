import java.net.InetAddress;
import java.net.URL;
import static java.net.InetAddress.getLocalHost;


void main() throws IOException {
    System.out.println("Map Collect");
    new Map_Collect();
    System.out.println("Reduce");
    new Reduce();
    System.out.println("Parallel");
    new Parallel();
    System.out.println("InetAddress");
    new InetAddressMethod();
    System.out.println("InputStreamReader");
    new InputStreamReaderMethod();
    System.out.println("RandomStreamPrediction");
    new RandomStreamPrediction();
    System.out.println("Adjacency Lists");
    new AdjacencyLists();
    System.out.println("User Input Recognition");
    new UserInputRecognition();
    System.out.println("Adjacency Matrix");
    new AdjacencyMatrix();
    System.out.println("HashTable 1");
    HashTable1();
    System.out.println("Merge Sort 1");
    MergeSort1();
    System.out.println("Recursion");
    Recursion();
    System.out.println("Selection Sort 1");
    SelectionSort1();
    System.out.println("InsertionSort 1");
    InsertionSort1();
    System.out.println("Bubble Sort 1");
    BubbleSort1();
    System.out.println("Interpolation_Search 1");
    Interpolation_Search1();
    System.out.println("Binary Search 1");
    BinarySearch1();
    System.out.println("Linear Search 1");
    LinearSearch1();
}
void HashTable1(){
    /*
        Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
                    Each key/value pair is known as an Entry
                    FAST Insertion, look up, deletion of key/value pairs
                    Not ideal for small datasets, great with large data sets


        hashing   = Takes a key and computes an integer (formula will vaty based on key & data type)
                    In a Hashtable, we use the hash % capacity to calculate an index number

                    key.hashCode() % capacity = index

        bucket    = an indexed storage location for one or more Entries
                    can store multiple Entries in case of a collision (linked similarly a LinkedList)

        collision = hash function generates the same index for more than one key
                    less collision = more efficiency

        Runtime complexity = Best Case o(1)
                                 Worst Case O(n)
    */
    /* declares table as a Hashtable */
    Hashtable<Integer,String> table = new Hashtable<>(10/* we can declare the capacity and a load factor from the start */);
    /* adding elements in the Hashtable */
    table.put(100, "SpongeBob");
    table.put(123, "Patric");
    table.put(321, "Sandy");
    table.put(555, "Squid-ward");
    table.put(777, "Gary");
    /* print a value with a specific key */
    System.out.println(table.get(100) + "\n");
    /* we can also print all the values using a for loop */
    for(Integer key : table.keySet()){
        System.out.println(key.hashCode() + "\t"+ key + "\t" + table.get(key));
    }
    System.out.println();
    System.out.println("HashTable 2");
    HashTable2();
    System.out.println("HashTable 3");
    HashTable3();
    System.out.println("HashTable 4");
    HashTable4();
}
static void HashTable2(){
    Hashtable<Integer,String> table = new Hashtable<>(10);
    /* adding elements in the Hashtable */
    table.put(100, "SpongeBob");
    table.put(123, "Patric");
    table.put(321, "Sandy");
    table.put(555, "Squid-rd");
    table.put(777, "Gary");
    /* we can remove values from the key */
    table.remove(777);
    /* we can also print all the values using a for loop */
    for(Integer key : table.keySet()){
        System.out.println(key.hashCode() + "\t"+ key + "\t" + table.get(key));
    }
    System.out.println();
}
static void HashTable3(){
    Hashtable<Integer,String> table = new Hashtable<>(10);
    /* adding elements in the Hashtable */
    table.put(100, "SpongeBob");
    table.put(123, "Patric");
    table.put(321, "Sandy");
    table.put(555, "Squid-ward");
    table.put(777, "Gary");
    /* we can also print all the values using a for loop */
        /*
            In this example:

            SpongeBob is index 0
            Patric is index 3
            Sandy is index 1
            Squid-ward is index 5
            Gary is index 7
        */
    for(Integer key : table.keySet()){
        System.out.println(key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
    }
    System.out.println();
}
static void HashTable4(){
    Hashtable<String,String> table = new Hashtable<>(10);
    /* adding elements in the Hashtable */
    table.put("100", "SpongeBob");
    table.put("123", "Patric");
    table.put("321", "Sandy");
    table.put("555", "Squid-ward");
    table.put("777", "Gary");
    /* we can also print all the values using a for loop */
        /*
            In this example:

            SpongeBob is index 5
            Patric is index 0
            Sandy is index 0
            Squid-ward is index 9
            Gary is index 5

            Here there are 2 collision. Both of these collision will go to 2 different buckets and each bucket will be treated as a LinkedList
        */
    for(String key : table.keySet()){
        System.out.println(key.hashCode() + "\t"+ key + "\t" + table.get(key));
    }
    System.out.println("\nOR\n");
    for(String key : table.keySet()){
        System.out.println(key.hashCode() % 10 + "\t"+ key + "\t" + table.get(key));
    }
}
void MergeSort1(){
    /*
        Merge Sort = Recursively divide array in 2, sort, re-combine
                     Run-time complexity = (n log n)
                     Space complexity = 0(n)
    */
    int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
    System.out.println("Without sort: ");
    /* iterates through the array */
    for (int j : array) {
        System.out.print(j + " ");
    }
    System.out.println();
    System.out.println("Merge Sort 2");
    MergeSort2();
}
static void MergeSort2(){
    int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
    System.out.println("With sort: ");
    /* calls the mergeSort method */
    mergeSort(array);
    /* iterates through the array */
    for (int j : array) {
        System.out.print(j + " ");
    }
}
static void mergeSort(int[] array){

    int length = array.length;
    if (length <= 1) return; /* base case */

    int middle = length / 2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    int i = 0; /* for left array */
    int j = 0; /* for right array */

    for(; i < length; i++){
        if(i < middle){
            leftArray[i] = array[i];
        }
        else{
            rightArray[j] = array[i];
            j++;
        }
    }

    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
}
static void merge(int[] leftArray, int[] rightArray, int[] array){

    int leftSize = array.length / 2;
    int rightSize = array.length - leftSize;
    /* indices */
    int i = 0; /* for the original array used to keep track of the position */
    int l = 0; /* for leftArray */
    int r = 0; /* for rightArray */

    /* check the conditions for merging */
    while(l < leftSize && r < rightSize){
        if (leftArray[l] < rightArray[r]){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        else{
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
    while(l < leftSize){
        array[i] = leftArray[l];
        i++;
        l++;
    }
    while(r < rightSize){
        array[i] = rightArray[r];
        i++;
        r++;
    }
}
void Recursion(){
    /*
        Recursion = When a thing is defined in terms of itself. -Wikipedia
                    Apply the result of a procedure, to a procedure.
                    A recursive method calls itself. Can be a substitute for iteration.
                    Divide method calls itself. Can be a substitute for iteration.
                    Commonly used with advanced sorting algorithms and navigating trees

                    Advantages:
                    1. Easier to read/write
                    2. Easier to debug

                    Disadvantages:
                    1. Sometimes slower
                    2. Uses more memory
    */

    /* it will show how many steps you take */
    walk(5);
    System.out.println();
    /* if we call the method too many times, we will run out of memory */
    walk_Exception(100000);
    System.out.println("\n Factorial number of 7: ");
    System.out.println(factorial(7));
    System.out.println("2^8: ");
    System.out.print(power(2,8));
}
static void walk_Exception(int steps) {
    try{
        if(steps < 1) return; /* if the is only 1 statement, we don't need curly braces */
        System.out.println("You take a step");
        walk(steps - 1);
    }
    catch(StackOverflowError SOE){
        System.out.println("Run out of memory");
    }
}
static void walk(int steps) {
    /*
        Iterative approach example:

        for(int i = 0; i < steps; i++){
            System.out.println("You take a step");
        }

    */
    /* the recursive way */
    if(steps < 1) return; /* if the is only 1 statement, we don't need curly braces || base case */
    System.out.println("You take a step");
    walk(steps - 1); /* recursive case */
}
static int factorial(int num) {

    if (num < 1) return 1; /* base case */
    return num * factorial(num - 1); /* recursive */
}
static int power(int base, int exponent) {

    if (exponent < 1) return 1; /* base case */
    return base * power(base, exponent - 1); /* recursive case */
}
void SelectionSort1(){
    /*
        Selection Sort = search through an array and keep track of the minimum value during
                         each iteration. At the end of each iteration, we swap variables.

                         Quadratic time = 0(n^2)
                         small data set = okay
                         large data set = BAD
    */
    System.out.println("Before sort: ");
    int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
    /* iterates through the array */
    for(int i : array){
        System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Selection Sort 2");
    SelectionSort2();
    System.out.println("Selection Sort 3");
    SelectionSort3();
}
static void SelectionSort2(){
    int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
    /* call the method selectionSort (ascending) */
    selectionSortAscending(array);
    System.out.println("After sort (ascending): ");
    /* iterates through the array */
    for(int i : array){
        System.out.print(i + " ");
    }
    System.out.println();
}
static void SelectionSort3(){
    int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
    /* call the method selectionSort (descending) */
    selectionSortDescending(array);
    System.out.println("After sort (descending): ");
    /* iterates through the array */
    for(int i : array){
        System.out.print(i + " ");
    }
}
static void selectionSortAscending(int[] array) {

    for(int i = 0; i < array.length - 1 ; i++){
        int min = i;
        for(int j = i + 1; j < array.length; j++){
            if(array[min] > array[j]){
                min = j;
            }
        }
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
static void selectionSortDescending(int[] array) {

    for(int i = 0; i < array.length - 1 ; i++){
        int min = i;
        for(int j = i + 1; j < array.length; j++){
            if(array[min] < array[j]){
                min = j;
            }
        }
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
void InsertionSort1(){
    /*
        Insertion Sort = after comparing elements to the left
                         shift elements to the right to make room to insert a value

                         Quadratic time = O(n^2)
                         small data set = decent
                         large data set = BAD

                         Fewer steps than Bubble Sort
                         Best case is O(n) compared to Selection Sort
    */
    System.out.println("Without sort: ");
    int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
    /* iterates through array */
    for(int i : array){
        System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("InsertionSort 2");
    InsertionSort2();
}
static void InsertionSort2(){
    System.out.println("With sort: ");
    int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
    /* calls method InsertionSorts */
    InsertionSorts(array);
    /* iterates through array */
    for(int i : array){
        System.out.print(i + " ");
    }
}
static void InsertionSorts(int[] array) {

    for(int i = 1; i < array.length; i++){
        int temp = array[i];
        int j = i - 1;

        while(j >= 0 && array[j] > temp){
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = temp;
    }

}
void BubbleSort1(){
    /*
        Bubble Sort = Pairs of adjacent elements are compared, and the elements
                      swapped if they are not in order

                      Quadratic time = O(n^2)
                      small data set = mediocre
                      large data set = bad
    */
    int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    System.out.println("Without Bubble Sort: ");
    for(int i : array){
        System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Bubble Sort 2");
    BubbleSort2();
}
static void BubbleSort2(){
    int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    System.out.println("With Bubble Sort: ");
    bubble_Sort(array);

    for(int i : array){
        System.out.print(i + " ");
    }
}
static void bubble_Sort(int[] array){

    for(int i = 0; i < array.length - 1; i++){
        for(int j = 0; j < array.length - i - 1; j++){
            /* this is for ascending order. If we wanted a descending order, we would write "if(array[j] < array[j+1])" */
            if(array[j] > array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}
void Interpolation_Search1(){
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
void BinarySearch1(){
    /*
        Binary Search = Search algorith that fields the position
                        of a target value within a sorted array
                        Half of the array is eliminated during each "step"

                        runtime complexity: O(log n)
    */
    System.out.println("Integrated Binary Search method");
    int[] array = new int[100];
    int target = 42;
    /* loops through the array */
    for(int i = 0; i < array.length; i++){
        array[i] = i;
    }
    /* calls the integrated Binary Search method */
    int index = Arrays.binarySearch(array, target);
    /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
    if(index == -1){
        System.out.println(target + " not found");
    }
    else{
        System.out.println("Element found at " + index);
    }
    System.out.println();
    System.out.println("Binary Search 2");
    BinarySearch2();
    System.out.println("Binary Search 3");
    BinarySearch3();
}
static void BinarySearch2() {

    System.out.println("Our own method with small number of elements");

    int[] array = new int[100];
    int target = 42;
    /* loops through the array */
    for(int i = 0; i < array.length; i++){
        array[i] = i;
    }
    /* calls our own Binary Search method */
    int index = binarySearch(array, target);
    /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
    if(index == -1){
        System.out.println(target + " not found");
    }
    else{
        System.out.println("Element found at " + index);
    }
    System.out.println();
}
static void BinarySearch3() {

    System.out.println("Our own method with big number of elements");

    int[] array = new int[1000000];
    int target = 777777;
    /* loops through the array */
    for(int i = 0; i < array.length; i++){
        array[i] = i;
    }
    /* calls our own Binary Search method */
    int index = binarySearch(array, target);
    /* if the element is not found the method will return -1. If the element is found, the method will return the index of the element */
    if(index == -1){
        System.out.println(target + " not found");
    }
    else{
        System.out.println("Element found at " + index);
    }
}
/* Our own Binary Search method */
static int binarySearch(int[] array, int target) {

    int low = 0;
    int high = array.length - 1;

    while(low <= high){

        int middle = low + (high - low) / 2;
        int value = array[middle];

        System.out.println("Middle: " + value);

        if(value < target) low = middle + 1;
        else if(value > target) high = middle - 1;
        else return middle; /* target is found */
    }
    return -1; /* target is not found */
}
void LinearSearch1(){
    /*
        Linear Search = Iterate through a collection one element at a time

                        runtime complexity: 0(n)

                        Disadvantages:
                        Slow for large data sets

                        Advantages:
                        Fast for searches of small to medium data sets
                        Does not need to sorted
                        Useful for Data Structures that do not have random access (Linked List)
    */
    /* declaration of an array */
    int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    int index = Linear_Search(array,1);

    if(index != (-1)){
        System.out.println("Element found at index: " + index);
    }
    else{
        System.out.println("Element not found");
    }
    System.out.println("Linear Search 2");
    LinearSearch2();
    System.out.println("Linear Search 3");
    LinearSearch3();
}
static void LinearSearch2(){
    int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    int index = Linear_Search(array,5);

    if(index != (-1)){
        System.out.println("Element found at index: " + index);
    }
    else{
        System.out.println("Element not found");
    }
}
static void LinearSearch3(){
    int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    int index = Linear_Search(array,10);

    if(index != (-1)){
        System.out.println("Element found at index: " + index);
    }
    else{
        System.out.println("Element not found");
    }
}
/* calling a method that does a linear search on the array. If the index of the value is found, it will return the index. If it is not found, it will return -1 */
static int Linear_Search(int[] array, int value) {
    for(int i = 0; i < array.length; i++){
        if(array[i] == value){
            return i;
        }
    }
    return -1;
}