import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyLists {
    AdjacencyLists(){
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
}

class GraphAdjacencyLists {

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
