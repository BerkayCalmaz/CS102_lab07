import java.util.Arrays;

public class SimpleStackWithQueue {
    private SimpleQueue q1;
    private SimpleQueue q2;

    SimpleStackWithQueue(){
        q1 = new SimpleQueue();
        q2 = new SimpleQueue();
    }

    public void push( String data){
        q2.enqueue( data );
        while( !q1.isEmpty()){
            q2.enqueue( q1.dequeue() );
        }
        SimpleQueue temp = new SimpleQueue();
        q1 = temp;
        q1 = q2;
        q2 = temp;
    }

    public String pop(){
        return q1.dequeue();
    }

    @Override
    public String toString() {
        return "SimpleStackWithQueue{" +
                "q1=" + q1 +
                ", q2=" + q2 +
                '}';
    }
}
