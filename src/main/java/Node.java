public class Node implements Comparable<Node> {
    private int frequency;
    Node left;
    Node right;

    public Node(Node left, Node right){
        this.frequency = left.frequency + right.frequency;
        this.left = left;
        this.right = right;
    }

    /*
     * TODO
     * The Node class should have two constructors. The first should accept an int frequency and
     * set both left and right Node values to null (this covers Leaf, which exends Node). The
     * second Node constructor should accept two Nodes (left and right) and set the frequency to
     * the sum of both Node frequencies (this is used when building a Tree from a PriorityQueue).
     * 
     * Finally, the Node class should implement getLeftNode() and getRightNode() getter methods.
     */

    public Node(int frequency) {
        //TODO Auto-generated constructor stub
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
    
    public Node getLeftNode() {
        return left;
    }

    public Node getRightNode() {
        return right;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Node n) {
        return Integer.compare(this.frequency, n.frequency);
    }
}
