public class NodeTest {

    public static void main(String[] args) {
        SimpleLinkedList sll;
        sll = new SimpleLinkedList();

        //Add to tail method
        sll.insertToTail(  "Maybe");
        sll.insertToTail(  "I");
        sll.insertToTail(  "love" );
        sll.insertToTail( "melons");
        System.out.println( "------All elements-------");
        System.out.println( sll.toString() );

        //Testing the get method
        System.out.println( "------TEST METHOD-------");
            //for the last index
        sll.get("melons" );
            //for the first index
        sll.get( "Maybe" );
            //for a random index
        sll.get( "love" );


        //Testing the remove method
        System.out.println( "------REMOVE METHOD-------");

        System.out.println( sll.removeFromHead() );
            //printing all nodes
        System.out.println( sll.toString() );

        System.out.println( "------STACK TEST-------");
        SimpleStackWithQueue stack = new SimpleStackWithQueue();
        stack.push( "1");
        stack.push( "2");
        stack.push( "3");
        System.out.println( stack.toString() );

        stack.push( "5");
        System.out.println( stack.pop() );
        System.out.println( stack.toString() );

    }
}
