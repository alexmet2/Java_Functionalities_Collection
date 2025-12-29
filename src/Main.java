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
    Adjacency_Lists();
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

void Adjacency_Lists(){
    /*
        Adjacency List = An Array/ArrayAist of LinkedList
                         Each LinkedList has a unique node at the head
                         All adjacent neighbors to that node are added to that node's LinkedList

                         runtime complexity to check an Edge: O(v)
                         space complexity: O(v+e)
    */
    /* declares graph */
    Graph graph = new Graph();
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

static class Graph {

    ArrayList<LinkedList<Node>> alist;

    Graph(){
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