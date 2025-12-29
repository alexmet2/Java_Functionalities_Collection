import java.net.InetAddress;
import java.net.URL;
import static java.net.InetAddress.getLocalHost;


void main() throws IOException {
    System.out.println("Map Collect");
    Map_Collect();
    System.out.println("Reduce");
    Reduce();
    System.out.println("Parallel");
    Parallel();
    System.out.println("InetAddress");
    InetAddress();
    System.out.println("InputStreamReader");
    InputStreamReader();
    System.out.println("RandomStreamPrediction");
    RandomStreamPrediction();
    System.out.println("Adjacency Lists");
    AdjacencyLists();
    System.out.println("User Input Recognition");
    UserInputRecognition();
    System.out.println("Adjacency Matrix");
    AdjacencyMatrix();
    System.out.println("HashTable 1");
    HashTable1();
    System.out.println("Merge Sort 1");
    MergeSort1();
    System.out.println("Recursion");
    Recursion();
}
void Map_Collect(){
    List<Integer> l1 = Arrays.asList(1,2,3,4,5);
    List<Integer> l2 = l1.stream().map(x->x*x).toList();
    for(Integer i : l2) System.out.println(i);
}
void Reduce(){
    int[] ar = {1,2,3,4,5,6,7,8,9,10};
    int sum = 0;
    for(int i : ar) sum += i;
    // OR
    // Reduce method
    int sum1 = Arrays.stream(ar).reduce(0,(x,y) -> x+y);
    int sum2 = Arrays.stream(ar).reduce(0, Integer::sum);
    System.out.println(sum);
    System.out.println(sum1);
    System.out.println(sum2);
}
void Parallel(){
    IntStream num = IntStream.range(1, 10);
    num.parallel().forEach(System.out::println);
}
void InetAddress() throws UnknownHostException, MalformedURLException {
    InetAddress address = getLocalHost();
    URL web = new URL("https://el-gr.facebook.com/");
    System.out.println("Protocol " + web.getProtocol());
    System.out.println("Host " + web.getHost());
    System.out.println("Port " + web.getPort());
    System.out.println("Authority " + web.getAuthority());
    System.out.println("Query " + web.getAuthority());
    System.out.println(address.getHostAddress());
}
void InputStreamReader() throws IOException {
    URL webpage = new URL("https://el-gr.facebook.com/");
    InputStreamReader  inp = new InputStreamReader(webpage.openStream());
    try (BufferedReader in = new BufferedReader(inp)) {
        String selida;
        while(null!=(selida = in.readLine())){
            System.out.println(selida);
        }
    }
}
void RandomStreamPrediction(){
    Stream<Integer> rand = Stream.generate(()->(new Random()).nextInt(81));
    System.out.println("The numbers you should play in the next Kino game is ");
    rand.limit(5).forEach(System.out::println);
}
void AdjacencyLists(){
    /*
        Adjacency List = An Array/ArrayAist of LinkedList
                         Each LinkedList has a unique node at the head
                         All adjacent neighbors to that node are added to that node's LinkedList

                         runtime complexity to check an Edge: O(v)
                         space complexity: O(v+e)
    */
    /* declares graph */
    GraphAdjacencyLists graph = new GraphAdjacencyLists();
    /* we add a node in the graph */
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
    /* we add edges to our graph */
    graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(4, 0);
    graph.addEdge(4, 2);
    /* prints graph */
    graph.print();
}
static class Node {

    char data;

    Node(char data){
        this.data = data;
    }
}
static class GraphAdjacencyLists {

    ArrayList<LinkedList<Node>> alist;

    GraphAdjacencyLists(){
        alist = new ArrayList<>();
    }
    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }
    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).getFirst();
        currentList.add(dstNode);
    }
    public boolean checkEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).getFirst();

        for(Node node : currentList){
            if(node == dstNode){
                return true;
            }
        }
        return false;
    }
    public void print(){
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
void UserInputRecognition(){
    try (Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8)) {
        System.out.println("Input something");
        char a1 = scan.next().charAt(0);
        /* conversion from char to String to int */
        /* in case of error(character or symbol), it will recognize that it is not a number */
        try{
            /* for negative */
            if(a1 == '-'){
                System.out.println("You inserted something lower than 0");
            }
            else{
                System.out.println("The program is taking " + a1);
                String a2 = String.valueOf(a1);
                int b = Integer.parseInt(a2); /* the error happens here */
                /* for numbers */
                if(check_int(b)){
                    System.out.println("You inserted a number between 0-9");
                }
                else{
                    System.out.println("You inserted something bigger than 0-9");
                }
            }
        }
        catch(NumberFormatException NFE){
            /* for characters or symbols */
            if(Character.isUpperCase(a1)){
                if(check_cap_eng(a1,'A','Z')){
                    System.out.println("You inserted a UpperCase English Character");
                }
            }
            else if(Character.isLowerCase(a1)){
                if( check_lower_eng(a1,'a','z')){
                    System.out.println("You inserted a LowerCase English Character");
                }
            }
            else{
                System.out.println("You inserted a symbol");
            }
        }
    }
}
static boolean check_int(int b){
    return 0<=b && b<=9;
}
static boolean check_cap_eng(char a, char b, char c){
    return b<=a && a<=c;
}
static boolean check_lower_eng(char a, char b, char c){
    return b<=a && a<=c;
}
void AdjacencyMatrix(){
    /*
        Adjacency Matrix =  An array to store 1's or 0's represent edges
                            # of rows    = # of unique nodes
                            # of columns = # of unique nodes

                            runtime complexity to check an Edge: O(1)
                            space complexity: O(v^2) *v = # of vertices (nodes*
    */
    /* declares graph */
    GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(5);
    /* adding nodes */
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C'));
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));
    /* adding edges to our nodes */
    graph.addEdge(0,1); /* for A to B */
    graph.addEdge(1,2); /* for B to C */
    graph.addEdge(2,3); /* for C to D */
    graph.addEdge(2,4); /* for C to E */
    graph.addEdge(4,0); /* for E to A */
    graph.addEdge(4,2); /* for E to C */
    /* prints the graph */
    graph.print();
    System.out.println();
    /* checks to see if the is a node between 0 and 1 (A and B) which here it is true */
    System.out.println("Node between A and B");
    System.out.println(graph.checkEdge(0, 1));
    /* checks to see if the is a node between 3 and 2 (D and C) which here it is false */
    System.out.println("\nNode between D and C");
    System.out.println(graph.checkEdge(3, 2));
}
static class GraphAdjacencyMatrix {

    ArrayList<Node> nodes;
    int[][] matrix;

    GraphAdjacencyMatrix(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
    public boolean checkEdge(int src, int dst){

        return matrix[src][dst] == 1;
    }
    public void print(){
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
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