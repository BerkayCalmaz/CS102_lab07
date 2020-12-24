public class SimpleQueue {
    SimpleLinkedList queue;

    public SimpleQueue(){
        queue = new SimpleLinkedList();
    }

    public void enqueue(String data){
        queue.insertToTail( data);
    }

    public String dequeue(){
        if( queue.isEmpty()){
            return "This queue is empty";
        }
        else{
            return(queue.removeFromHead() );
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    @Override
    public String toString() {
        return "SimpleQueue{" +
                "queue=" + queue +
                '}';
    }
}
