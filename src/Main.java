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