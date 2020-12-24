public class SimpleLinkedList {
    Node head;
    int size;

    public SimpleLinkedList(){
        head = null;
    }

    public void insertToHead( Node newNode ){
        Node temp = head;
        head = newNode;
        newNode.setNextNode( temp );
    }

    public void insertToTail( String data ){
        Node temp = head;
        if( head == null){
            head = new Node( data );
        }
        else{
            while( temp.getNextNode() != null ) {
                temp = temp.getNextNode();
            }
            temp.setNextNode( new Node( data ));
        }
    }

    public String removeFromHead(){
        if( !this.isEmpty() ) {
            Node temp = head;
            String str = head.getData();
            temp = temp.getNextNode();
            head = temp;
            return str;
        }
        else{
            return "Node is empty.";
        }
    }

    public boolean isEmpty(){
        if( head == null){
            return true;
        }
        else
            return false;
    }

    public Node get( String data){
        for( Node temp = head; temp != null; temp = temp.getNextNode()){
            if( data.equals( temp.getData())){
                System.out.println( temp.getData() + " is found and returned.");
                return temp;
            }
        }
        return null;
    }

    public String toString(){
        String str = "";
        for( Node current = head; current != null; current = current.getNextNode()){
            str = current.getData() + " " + str ;
        }
        return str;
    }


}
