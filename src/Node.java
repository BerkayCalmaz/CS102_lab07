public class Node {
    private Node nextNode;
    private String data;

    public Node( String data, Node next){
        this.data = data;
        nextNode = next;
    }

    public Node( String data ){
        this.data = data;
        nextNode = null;
    }

    public String getData(){
        return data;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public void setNextNode( Node nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nextNode=" + nextNode +
                ", data='" + data + '\'' +
                '}';
    }
}
